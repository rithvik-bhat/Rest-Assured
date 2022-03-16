package RestTesting;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Trello {
	//Base url is common for all the actions
	public static String baseurl = "https://api.trello.com";
    public static String id;
	@Test(priority = 0)
	public void createBoard()
	{
		//I want to fetch base url so I can add other things to base url
		//This is the first step to provide base url to the request
		RestAssured.baseURI = baseurl;
		
		//in rest assured we have three keywords
		//given: pre-condition includes like parameter
		//when: condition I am testing like resource; we have to provide the name
		//then: post condition is something like response; check the response
		Response response = given().queryParam("name", "New Board")
		.queryParam("key", "b43158edf32ba7c9b27c59f27249b135")
		.queryParam("token", "ccc0ae5955b8caa6819df069ca49512ac9e678610ad2edb7e0baafd2b69ca1ea")
		.header("Content-Type", "application/json")
		
		.when()
		.post("/1/boards/")
		
		.then()
		.assertThat().statusCode(200).contentType(ContentType.JSON)
		.extract().response();
		//This is to fetch the response as string
		String jsonresponse = response.asString();
		//I want to convert the response into json format
		JsonPath js = new JsonPath(jsonresponse);
		//I have to fetch the id
		id = js.get("id");
	}
	
	//If I make @Test method enabled =false that method will not execute

	@Test(priority = 1)
	public void getBoard()
	{
		RestAssured.baseURI = baseurl;
		
		Response response = given()
		.queryParam("key", "b43158edf32ba7c9b27c59f27249b135")
		.queryParam("token", "ccc0ae5955b8caa6819df069ca49512ac9e678610ad2edb7e0baafd2b69ca1ea")
		.header("Content-Type", "application/json")
		
		.when()
		.get("/1/boards/"+id)
		
		.then()
		.assertThat().statusCode(200).contentType(ContentType.JSON)
		.extract().response();
		String jsonresponse = response.asString();
		
		System.out.println(jsonresponse);
	}

	@Test(priority = 2)
	public void DeleteBoard()
	{
		RestAssured.baseURI = baseurl;
		
		Response response = given()
		.queryParam("key", "b43158edf32ba7c9b27c59f27249b135")
		.queryParam("token", "ccc0ae5955b8caa6819df069ca49512ac9e678610ad2edb7e0baafd2b69ca1ea")
		.header("Content-Type", "application/json")
		
		.when()
		.delete("/1/boards/"+id)
		
		.then()
		.assertThat().statusCode(200).contentType(ContentType.JSON)
		.extract().response();
		String jsonresponse = response.asString();
		
		System.out.println(jsonresponse);
	}
	
}
