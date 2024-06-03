package Test;

import BaseUrl.HerokuAppBaseUrl;
import TestData.TestDataHeokuApp;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class C21_Post_TestDataUsage extends HerokuAppBaseUrl {

    @Test
    public void postTest01() {

        //1- url , reqBody
        specHerokuApp.pathParam("pp1", "booking");

        TestDataHeokuApp testDataHeokuApp = new TestDataHeokuApp();

        JSONObject reqBody = testDataHeokuApp.createBooking();

        //2- expected data
        JSONObject expectedData = testDataHeokuApp.createExpectedData();

        //3- response
        Response response = given().spec(specHerokuApp).contentType(ContentType.JSON)
                .when().body(reqBody.toString()).put("/{pp1}");

        response.prettyPrint();

        //4- assertion
        JsonPath responseJP = response.jsonPath();

        Assert.assertEquals(testDataHeokuApp.successCode, response.getStatusCode());
        Assert.assertEquals(expectedData.getJSONObject("booking").get("firstname"),
                responseJP.get("booking.firstname"));
        Assert.assertEquals(expectedData.getJSONObject("booking").getJSONObject("bookingdates").get("checkin")
                , responseJP.get("booking.bookingdates.checkin"));


    }


}
