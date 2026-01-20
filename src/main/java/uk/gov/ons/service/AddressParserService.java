package uk.gov.ons.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import tools.jackson.databind.json.JsonMapper;

import scala.collection.JavaConverters;
import uk.gov.ons.addressIndex.crfscala.CrfScalaJniImpl;
import uk.gov.ons.addressIndex.parsers.Parser;
import uk.gov.ons.entities.Tokens;

@Service
@DependsOn("config")
public class AddressParserService {
	
	private CrfScalaJniImpl natif;
	
	public AddressParserService(@Value("${model.path}") String modelPath) {
		super();
		natif = new CrfScalaJniImpl();
		natif.loadModel(modelPath);		
	}

	public Tokens parseAddress(String address) {
		
		return new JsonMapper()
				.convertValue(JavaConverters.mapAsJavaMapConverter(new Parser(natif).parse(address)).asJava(), Tokens.class);
	}

}
