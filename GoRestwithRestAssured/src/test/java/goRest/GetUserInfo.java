package goRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetUserInfo {
	
	@Test
	public void getUser() {
		
		RestAssured
		.given()
		.header("Authorization", "Bearer c4ce527a345b75c71dec2f640d5301eb2842814293a10f6f832bb4a1e360cb8b")
		.when()
		.get("https://gorest.co.in/public/v2/users/1061283")
		.then()
		.statusCode(200)
		.log().all();
	}

}
