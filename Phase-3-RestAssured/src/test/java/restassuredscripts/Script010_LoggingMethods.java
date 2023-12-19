package restassuredscripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Script010_LoggingMethods {
	
	
	@Test
	public void LoggingRestAssured() {
		
		String PMapikey = "PMAK-657b263350cb3f00386a3a9b-b7d2f80329511182bc480ede9ce0f94133";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PMapikey)
		.when().get()
		.then().log().all();
		//.then().log().headers();
		//.then().log().ifError();
		//.then().statusCode(200).log().cookies();
		
		
	}

}