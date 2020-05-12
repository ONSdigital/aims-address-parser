package uk.gov.ons.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
import uk.gov.ons.entities.Tokens;
import uk.gov.ons.service.AddressParserService;

@Component
public class AddressParserHandler {
	
	@Autowired
	AddressParserService service;

	public Mono<ServerResponse> parseAddress(ServerRequest request) {
		
		Optional<String> address = request.queryParam("address");
		
		if (address.isEmpty() || address.get().isBlank()) {
			return ServerResponse.badRequest().body(BodyInserters.fromValue("No address parameter."));
		}
		
		Mono<ServerResponse> noTokens = ServerResponse.noContent().build();
		Optional<Tokens> tokens = service.parseAddress(address.orElse(""));
		
	    return ServerResponse.ok().contentType(APPLICATION_JSON)
	  	      .bodyValue(tokens.get()).switchIfEmpty(noTokens);

	  }
}
