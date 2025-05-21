package Testingecommerce;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class getrequest {
	@Test
	public void testGetAllProducts() {
	    Response response = given()
	            .when()
	            .get("https://dummyjson.com/products");

	    response.prettyPrint();
Assert.assertEquals(response.getStatusCode(),200, "status code is 200");
	    Assert.assertEquals(response.getStatusCode(), 200, "Status Code is 200");
	    Assert.assertTrue(response.jsonPath().getList("products").size() < 0, "Product list is not empty");
	}

}
