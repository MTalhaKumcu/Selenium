package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import TestData.TestDataJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class C19_Put_TestDataClassusage extends JsonPlaceHolderBaseUrl {


    @Test
    public void test01() {
        //1 -url , request body
        specAppName.pathParams("pp1", "posts", "pp2", 70);
        TestDataJsonPlaceHolder testDataJsonPlaceHolder = new TestDataJsonPlaceHolder();
        JSONObject reqBody = testDataJsonPlaceHolder.createRequestBodyJson();

        //2-expected data
        JSONObject expectedBody = testDataJsonPlaceHolder.createRequestBodyJson();

        //3- response

        Response response = given().spec(specAppName)
                .contentType(ContentType.JSON)
                .when().body(reqBody.toString()).put("/{pp1}/{pp2}");
        response.prettyPrint();

        //4- assertion

        JsonPath resJp = response.jsonPath();
        assertEquals(testDataJsonPlaceHolder.successCode, response.getStatusCode());
        assertEquals(testDataJsonPlaceHolder.contentType, response.contentType());
        assertEquals(testDataJsonPlaceHolder.connecitonValue, response.getHeader("Connection"));


    }
}
