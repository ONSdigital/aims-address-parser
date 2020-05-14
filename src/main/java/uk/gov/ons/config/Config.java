package uk.gov.ons.config;

import static org.apache.commons.lang3.SystemUtils.IS_OS_LINUX;
import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC;
import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	private Logger logger = LoggerFactory.getLogger(Config.class);
	ApplicationContext ctx;
	Path taggerFile;
	Path crfsuiteFile;
	Path tmpDir;

	@Autowired
	public Config(ApplicationContext ctx) {

		this.ctx = ctx;
		String taggerLibrary;

		if (IS_OS_WINDOWS) {
			taggerLibrary = "libcrftagger.dll";
		} else if (IS_OS_MAC) {
			taggerLibrary = "libcrftagger.so";
		} else if (IS_OS_LINUX) {
			taggerLibrary = "libcrftagger-linux.so";
		}
		else {
			taggerLibrary = "";
			logger.error("tagger library failed to load. Is your OS supported? Supported OS (Linux, Windows and Mac)");
			SpringApplication.exit(ctx, () -> 0);
		}

		try {
			tmpDir = Files.createTempDirectory("parser_");
		} catch (IOException ioe) {
			logger.error(String.format("Failed to create tmp directory: %s", ioe.getMessage()));
			SpringApplication.exit(ctx, () -> 0);
		}

		// Load the tagger file
		try (InputStream in = Config.class.getClassLoader().getResourceAsStream(taggerLibrary);
			 OutputStream outputStream = Files.newOutputStream(taggerFile = Files.createTempFile(tmpDir, "", taggerLibrary))) {

			byte[] buffer = new byte[1024];
			int read = -1;

			while((read = in.read(buffer)) != -1) {
				outputStream.write(buffer, 0, read);
			}

		} catch (IOException ioe) {
			logger.error(String.format("tagger file failed to load: %s", ioe.getMessage()));
			SpringApplication.exit(ctx, () -> 0);
		}

		System.load(taggerFile.toString());

		// Load the crfsuite file
		try (InputStream in = Config.class.getClassLoader().getResourceAsStream("addressCRFA.crfsuite");
			 OutputStream outputStream = Files.newOutputStream(crfsuiteFile = Files.createTempFile(tmpDir,"crfsuiteFile", ""))) {

			byte[] buffer = new byte[1024];
			int read = -1;

			while((read = in.read(buffer)) != -1) {
				outputStream.write(buffer, 0, read);
			}

			System.setProperty("model.path", crfsuiteFile.toString());

		} catch (IOException ioe) {
			logger.error(String.format("crfsuite file failed to load: %s", ioe.getMessage()));
			SpringApplication.exit(ctx, () -> 0);
		}
	}

	@PreDestroy
	public void destroy() {
		
		/* Partial clean up of temp files.
		 * Unable to delete the tagger.dll under Windows as it has been loaded by the classloader 
		 * so cannot be deleted while it still exists!
		 * Linux cleans up /tmp on boot or by age.
		 */
		if (IS_OS_WINDOWS) {
			logger.info("Destroy called - removing temp file.");

			try {
				Files.delete(crfsuiteFile);
			} catch (IOException ioe) {
				logger.error(String.format("Error deleting temp file: %s", ioe.getMessage()));
			}
		}
	}
}