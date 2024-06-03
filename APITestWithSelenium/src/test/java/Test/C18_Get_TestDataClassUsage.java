package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import TestData.TestDataJsonPlaceHolder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class C18_Get_TestDataClassUsage extends JsonPlaceHolderBaseUrl {

    @Test
    public void getTest01() {


        //1-url
        specAppName.pathParams("pp1", "posts", "pp2", 22);
        //2-expected data
        TestDataJsonPlaceHolder testDataJsonPlaceHolder = new TestDataJsonPlaceHolder();
        JSONObject expectedData = testDataJsonPlaceHolder.expectedData();

        //3-response

        Response response = given().spec(specAppName).when().get("/{pp1}/{pp2}");
        response.prettyPrint();

        //4-assertion

        JsonPath resJP = response.jsonPath();
        Assert.assertEquals(expectedData.get("userId"), resJP.get("userId"));
        Assert.assertEquals(expectedData.get("id"), resJP.get("id"));
        Assert.assertEquals(expectedData.get("title"), resJP.get("title"));


    }
}
