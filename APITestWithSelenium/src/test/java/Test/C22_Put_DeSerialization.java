package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import TestData.TestDataJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class C22_Put_DeSerialization extends JsonPlaceHolderBaseUrl {
    @Test
    public void put01() {
        //1 url ve req body
        specAppName.pathParams("pp1", "posts", "pp2", 70);
        TestDataJsonPlaceHolder testDataJsonPlaceHolder = new TestDataJsonPlaceHolder();

        HashMap<String, Object> reqBody = testDataJsonPlaceHolder.createRequestBody();

        //2-expected data
        HashMap<String, Object> expectedData = testDataJsonPlaceHolder.createRequestBody();

        //3-response
        Response response = given().spec(specAppName).contentType(ContentType.JSON)
                .when().body(reqBody).put("/{pp1}/{pp2}");
        response.prettyPrint();

        //4-assertion

        HashMap<String, Object> respMap = response.as(HashMap.class);

        assertEquals(expectedData.get("title"), respMap.get("title"));

    }
}
