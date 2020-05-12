package uk.gov.ons.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

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

	@Autowired
	public Config(ApplicationContext ctx) {

		this.ctx = ctx;
		
		// Load the tagger file
		Path taggerFile;
	    
	    try (InputStream in = Config.class.getClassLoader().getResourceAsStream("libcrftagger-linux.so");
	    	 OutputStream outputStream = Files.newOutputStream(taggerFile = Files.createTempFile("taggerFile", ""))) {
	    	
			byte[] buffer = new byte[1024];
		    int read = -1;
	    	
	    	while((read = in.read(buffer)) != -1) {
	    		outputStream.write(buffer, 0, read);
		    }

		    System.load(taggerFile.toString());
		    
	    } catch (IOException ioe) {
	    	logger.error(String.format("tagger file failed to load: %s", ioe.getMessage()));
	    	SpringApplication.exit(ctx, () -> 0);
	    }
	    
	    // Load the crfsuite file
		Path crfsuiteFile;
	    
	    try (InputStream in = Config.class.getClassLoader().getResourceAsStream("addressCRFA.crfsuite");
	    	 OutputStream outputStream = Files.newOutputStream(crfsuiteFile = Files.createTempFile("crfsuiteFile", ""))) {
	    	
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
}
