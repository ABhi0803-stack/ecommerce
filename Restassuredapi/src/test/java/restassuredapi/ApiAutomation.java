package restassuredapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApiAutomation {
    @Test
    public void testCreateBusiness() throws IOException {
        BusinessRequest businessRequest = new BusinessRequest();
        businessRequest.setRequestType("create");
        businessRequest.setRefId("9865663");
        businessRequest.setName("Restasuured1");
        businessRequest.setWorkNumber("9848022387");
        businessRequest.setOwnerName("restranga");
        businessRequest.setMobileNumber("9848022009");
        businessRequest.setEmail("ranga98@gmail.com");
        businessRequest.setAccountType("multi_outlet");
        businessRequest.setIndustry("Food & Beverages");
        businessRequest.setLat("12.91669128");
        businessRequest.setLon("77.64782935");
        businessRequest.setAddress("Old No 93/2 New No 9,Maramma Temple Road");
        businessRequest.setArea("Katriguppe");
        businessRequest.setCity("Bengaluru");
        businessRequest.setState("Karnataka");
        businessRequest.setLandmark("Opp To Axis Bank");
        businessRequest.setPincode("560102");
        businessRequest.setPostalCode("560102");
        businessRequest.setPanNo("CHKOV1980B");
        businessRequest.setPanDoc("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
        businessRequest.setAadharNo("72388292846");
        businessRequest.setAadharDoc("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
        businessRequest.setGstNo("22AAAAA0000A1Z5");
        businessRequest.setGstDoc("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
        businessRequest.setBusinessLogo("https://dummyimage.com/600x400/000/fff.jpg");

        List<Timing> timings = new ArrayList<>();
        Timing timing = new Timing();
        timing.setDay(0);
        timing.setActive("1");

        List<Slot> slots = new ArrayList<>();
        Slot slot = new Slot();
        slot.setFrom("01:00");
        slot.setTo("22:00");
        slots.add(slot);

        timing.setSlots(slots);
        timings.add(timing);
        businessRequest.setTimings(timings);

        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("bitsila-api-key", "your_correct_api_key") // Ensure correct key
                .header("bitsila-client-token", "your_correct_client_token") // Added this
                .body(businessRequest)
                .when()
                .post("https://sys.test.bitsila.com/api/bitsila/setup_business.json");

        System.out.println("Response Body: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}