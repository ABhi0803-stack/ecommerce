package Testingecommerce;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class update {
	@Test
	public void testUpdateCartUsingMap() {
	List<Map<String, Object>> updatedProducts = new ArrayList<>();

    Map<String, Object> product1 = new HashMap<>();
    product1.put("id", 1);
    product1.put("quantity", 3);  // Updated quantity

    Map<String, Object> product2 = new HashMap<>();
    product2.put("id", 2);
    product2.put("quantity", 2);  // Updated quantity

    updatedProducts.add(product1);
    updatedProducts.add(product2);

    // Creating request body
    Map<String, Object> requestBody = new HashMap<>();
    requestBody.put("products", updatedProducts);

    // Sending PUT request to update cart
    Response response = given()
            .contentType(ContentType.JSON)
            .body(requestBody)
            .when()
            .put("https://dummyjson.com/carts/1");

    response.prettyPrint();

    // Assertions
    Assert.assertEquals(response.getStatusCode(), 200, "Status Code Mismatch!");
    Assert.assertTrue(response.jsonPath().getList("products").size() > 0, "Product list is empty!");
    Assert.assertEquals(response.jsonPath().getInt("products[0].quantity"), 3, "Quantity not updated correctly!");
}
}
