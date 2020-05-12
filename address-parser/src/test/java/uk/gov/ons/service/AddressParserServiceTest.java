package uk.gov.ons.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import uk.gov.ons.entities.Tokens;

@SpringBootTest()
@ExtendWith(SpringExtension.class)
class AddressParserServiceTest {

	@Autowired
	private AddressParserService service;
		
	@Test
	void testTokeniser() {
		
		Optional<Tokens> tokens = service.parseAddress("Acme Flowers Ltd First And Second Floor Flat 39b Cranbrook Road Windleybury GU166DE");
		
		Tokens expected = new Tokens("ACME FLOWERS LTD", 
									 null, 
									 "FIRST AND SECOND FLOOR FLAT", 
									 "39B", 
									 null, 
									 "39", 
									 "B", 
									 null, 
									 null, 
									 null, 
									 null, 
									 null, 
									 null, 
									 "CRANBROOK ROAD", 
									 "WINDLEYBURY", 
									 null, 
									 "GU16 6DE", 
									 "6DE", 
									 "GU16");
		
		assertNotNull(tokens.get());
		assertEquals(expected, tokens.get());
	}
}
