package br.com.desafio.test;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class IndicatorTest {
	
	@Test
    public void testEndpoint() {
        given()
          .when().get("/indicator")
          .then()
             .statusCode(200);
    }

}
