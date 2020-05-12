package uk.gov.ons.config;

import static org.springframework.http.MediaType.TEXT_PLAIN;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import uk.gov.ons.controllers.AddressParserHandler;

@Configuration
public class RouterConfig {
	
	@Bean
	public RouterFunction<ServerResponse> route(AddressParserHandler addressParserHandler) {

	    return RouterFunctions
	      .route(RequestPredicates.GET("/tokens")
	    		  .and(RequestPredicates.accept(TEXT_PLAIN)), addressParserHandler::parseAddress);
	  }

}
