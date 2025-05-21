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


public class postrequestadd {
	@Test
    public void testAddToCartUsingMap() {
        // Base URL for the API
        RestAssured.baseURI = "https://dummyjson.com";

        // Creating the list of products
        List<Map<String, Object>> products = new ArrayList<>();

        Map<String, Object> product1 = new HashMap<>();
        product1.put("id", 1);
        product1.put("quantity", 2);

        Map<String, Object> product2 = new HashMap<>();
        product2.put("id", 2);
        product2.put("quantity", 1);

        // Adding products to the list
        products.add(product1);
        products.add(product2);

        // Creating the final request body map
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("userId", 1);
        requestBody.put("products", products);

        // Sending the POST request
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)  // Passing the Map as request body
                .when()
                .post("/carts/add");

        // Printing the response
        response.prettyPrint();

        // Validating the response
        Assert.assertEquals(response.getStatusCode(), 201, "Status Code Mismatch!");
        Assert.assertEquals(response.jsonPath().getInt("userId"), 1, "User ID mismatch!");
        Assert.assertTrue(response.jsonPath().getList("products").size() > 0, "Product list is empty!");
    }


}
