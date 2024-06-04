package Test;

import BaseUrl.DummyBaseUrl;
import TestData.TestDataDummy;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

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

        assertEquals(testDataDummy.contenTypr, response.contentType());
        assertEquals(testDataDummy.successCode, response.getStatusCode());

        assertEquals(expData.get("message"), respMap.get("message"));
        assertEquals(expData.get("status"), respMap.get("status"));

        assertEquals(((Map) (expData.get("data"))).get("id")
                , ((Map) (respMap.get("data"))).get("id"));
        assertEquals(((Map) (expData.get("data"))).get("employee_name"),
                ((Map) (respMap.get("data"))).get("employee_name"));

    }

}
