package uk.gov.ons.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HandlerAndRouterTest {
	
    @Autowired
    private WebTestClient client;
    
	private Logger logger = LoggerFactory.getLogger(HandlerAndRouterTest.class);

	private String address = "Acme Flowers Ltd First And Second Floor Flat 39b Cranbrook Road Windleybury GU166DE";

	@Test
	void testParseAddress() {
		client.get()
			.uri(uriBuilder -> uriBuilder.path("/tokens")
					.queryParam("address", address).build())
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.consumeWith(response -> {
				Assertions.assertThat(response.getResponseBody()).isNotNull();
				logger.info(new String(response.getResponseBody()).toString());})
			.jsonPath("$.organisationName").isNotEmpty()
			.jsonPath("$.departmentName").isEmpty()
			.jsonPath("$.subBuildingName").isNotEmpty()
			.jsonPath("$.buildingName").isNotEmpty()
			.jsonPath("$.buildingNumber").isEmpty()
			.jsonPath("$.paoStartNumber").isNotEmpty()
			.jsonPath("$.paoStartSuffix").isNotEmpty()
			.jsonPath("$.paoEndNumber").isEmpty()
			.jsonPath("$.paoEndSuffix").isEmpty()
			.jsonPath("$.saoStartNumber").isEmpty()
			.jsonPath("$.saoStartSuffix").isEmpty()
			.jsonPath("$.saoEndNumber").isEmpty()
			.jsonPath("$.saoEndSuffix").isEmpty()
			.jsonPath("$.streetName").isNotEmpty()
			.jsonPath("$.locality").isNotEmpty()
			.jsonPath("$.townName").isEmpty()
			.jsonPath("$.postcode").isNotEmpty()
			.jsonPath("$.postcodeIn").isNotEmpty()
			.jsonPath("$.postcodeOut").isNotEmpty();
	}
	
	@Test
	void testParseAddressEmpty() {
		client.get()
			.uri(uriBuilder -> uriBuilder.path("/tokens")
					.queryParam("address", "").build())
			.exchange()
			.expectStatus().isBadRequest()
			.expectBody()
			.consumeWith(response -> {
				Assertions.assertThat(response.getResponseBody()).isNotNull();
				Assertions.assertThat(new String (response.getResponseBody())).isEqualTo("No address parameter.");
				logger.info(new String(response.getResponseBody()).toString());});
	}
	
	@Test
	void testParseAddressNull() {
		client.get()
			.uri("/tokens")
			.exchange()
			.expectStatus().isBadRequest()
			.expectBody()
			.consumeWith(response -> {
				Assertions.assertThat(response.getResponseBody()).isNotNull();
				Assertions.assertThat(new String (response.getResponseBody())).isEqualTo("No address parameter.");
				logger.info(new String(response.getResponseBody()).toString());});
	}
}
