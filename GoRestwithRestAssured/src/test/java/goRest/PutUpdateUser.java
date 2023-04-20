package goRest;
import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutUpdateUser {
	
	HashMap<String, String> map = new HashMap<>();
	
	@BeforeTest
	public void updateUser() {
		map.put("name", "JohnSmith");
		map.put("email", "JohnSmith225@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI ="https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/1061283";
	}
	@Test
	public void updateUserEmail() {
		RestAssured
		.given()
		.contentType("application/json")
		.body(map)
		.header("Authorization", "Bearer c4ce527a345b75c71dec2f640d5301eb2842814293a10f6f832bb4a1e360cb8b")
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all();
	}
	
	
	

}
