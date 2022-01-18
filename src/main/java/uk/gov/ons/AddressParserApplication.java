package uk.gov.ons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class AddressParserApplication implements CommandLineRunner {
	
    @Autowired
    private Environment env;
    
    @Override
    public void run(String... args) throws Exception {

    	log.info("{}", env.getProperty("model.path"));
    }

	public static void main(String[] args) {
		
		SpringApplication.run(AddressParserApplication.class, args);	
	}

}
