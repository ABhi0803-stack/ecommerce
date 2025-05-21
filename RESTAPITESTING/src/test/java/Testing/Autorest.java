package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Autorest {
	String baseURL = "https://reqres.in/api";

    @Test
    public void testSuccessfulLogin() {
    	user user1 = new user("eve.holt@reqres.in", "cityslicka");
    	
    	  // String requestBody = new String(Files.readAllBytes(Paths.get("src/test/resources/requestBody.json")));
    	
    	
    	// Map<String, String> requestBody = new HashMap<>();
    	 //   requestBody.put("email", "abhi@gmail.com");
    	   // requestBody.put("password", "abhi@123");
        Response response = given()
                .contentType(ContentType.JSON)
                .body(user1)
                .when()
                .post(baseURL + "/Login");

        // Print response
        response.prettyPrint();

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 200, "Status Code Mismatch!");
        Assert.assertNotNull(response.jsonPath().getString("token"), "Token should not be null!");
    }

}
