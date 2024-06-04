package Test;

import BaseUrl.DummyBaseUrl;
import TestData.TestDataDummy;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class C23_Get_DeSerialization extends DummyBaseUrl {


    @Test
    public void getTest01() {
        //1-url
        specOfDummyUrl.pathParams("pp1", "api"
                , "pp2", "v1"
                , "pp3", "employee"
                , "pp4", 4);

        //2-expected Data

        TestDataDummy testDataDummy = new TestDataDummy();
        HashMap<String, Object> expData = testDataDummy.expectedData();

        //3- response

        Response response = given().spec(specOfDummyUrl)
                .when().get("/{pp1}/{pp2}/{pp3}/{pp4}");
        response.prettyPrint();


        //4- assertion
        HashMap<String, Object> respMap = response.as(HashMap.class);
        Assert.assertEquals(((Map) (expData.get("data"))).get("id")
                , ((Map) (respMap.get("data"))).get("id"));

    }

}
