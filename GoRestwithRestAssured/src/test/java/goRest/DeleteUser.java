package goRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteUser {
	
	@Test
	public void deleteUser() {
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath ="public/v2/users/1061283";
		
		RestAssured
		.when()
		.delete()
		.then()
		.statusCode(204);
	}

}
