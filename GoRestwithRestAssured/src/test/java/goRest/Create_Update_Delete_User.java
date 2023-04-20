package goRest;

import java.util.UUID;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.HashMap;

public class Create_Update_Delete_User {
	
	HashMap<String, String> map = new HashMap<String, String>();
	int id;
	UUID uuid = UUID.randomUUID();
	
	@BeforeTest
	public void createPayload() {
		map.put("name", "JohnSmith");
		map.put("email", uuid + "@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI ="https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
	}
	
	@Test(priority=0)
	public void createUser() {
		Response response = RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer c4ce527a345b75c71dec2f640d5301eb2842814293a10f6f832bb4a1e360cb8b")
			.when()
				.post()
			.then()
				.statusCode(201)
				.log().all()
				.contentType(ContentType.JSON).extract().response();
		JsonPath jsonPath = response.jsonPath();
		id = jsonPath.get("id");
	}
	
	@Test(priority=1)
	public void updateUser() {
		map.put("name", "JohnSmith");
		map.put("email", uuid + "@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI ="https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/" +id;
		
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
	@Test(priority=2)
	public void deleteUser() {
		RestAssured.baseURI ="https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/" + id;
		
		RestAssured
		.given()
		.contentType("application/json")
		.body(map)
		.header("Authorization", "Bearer c4ce527a345b75c71dec2f640d5301eb2842814293a10f6f832bb4a1e360cb8b")
		.when()
				.delete()
		.then()
		        .statusCode(204);
	}

}
