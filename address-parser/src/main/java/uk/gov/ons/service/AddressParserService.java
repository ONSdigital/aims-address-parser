package uk.gov.ons.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import scala.collection.JavaConverters;
import uk.gov.ons.addressIndex.crfscala.CrfScalaJniImpl;
import uk.gov.ons.addressIndex.parsers.Parser;
import uk.gov.ons.entities.Tokens;

@Service
public class AddressParserService {
	
	private CrfScalaJniImpl natif;
	
	public AddressParserService(@Value("${model.path}") String modelPath) {
		super();
		natif = new CrfScalaJniImpl();
		natif.loadModel(modelPath);		
	}

	public Optional<Tokens> parseAddress(String address) {
		
		if (address.isBlank())
		{
			return Optional.empty();
		}

		return Optional.of(new ObjectMapper()
				.convertValue(JavaConverters.mapAsJavaMapConverter(new Parser(natif).parse(address)).asJava(), Tokens.class));
	}

}
