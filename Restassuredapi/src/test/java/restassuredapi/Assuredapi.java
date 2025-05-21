package restassuredapi;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;



import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Assuredapi {
 
	public void postmethod() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("status", "ASSIGNED");
		requestBody.put("orderId", "2025-01-20-143008"); 
		requestBody.put("riderName", "TestboyDeliveryy");
		requestBody.put("riderPhone", "9000012345");
		Response response = given().contentType("application/json").body(requestBody).when()
				.post("https://preprod.logistics-seller.mp2.in/external/order/update");

		response.then().statusCode(201).body("status", equalTo("ASSIGNED")).body("orderId",
				equalTo("2025-01-20-143008"));
	}

}
