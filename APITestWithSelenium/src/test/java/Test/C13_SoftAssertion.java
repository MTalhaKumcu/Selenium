package Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

public class C13_SoftAssertion {


    @Test
    public void test01() {

        //1-url
        String url = "https://dummy.restapiexample.com/api/v1/employee/3";

        //2-expected data
        JSONObject reqInnerBody = new JSONObject();

        reqInnerBody.put("id", 3)
                .put("employee_name", "Ashton Cox")
                .put("employee_salary", 86000)
                .put("employee_age", 66)
                .put("profile_image", "");

        JSONObject expectedData = new JSONObject();

        expectedData.put("status", "success")
                .put("data", reqInnerBody)
                .put("message", "Successfully! Record has been fetched.");

        //3-respons record


        Response response = given().when().get(url);
        response.prettyPrint();

        //4- assertion

        SoftAssert softAssert = new SoftAssert();

        JsonPath respJP = response.jsonPath();

        softAssert.assertEquals(respJP.get("status"),expectedData.get("status"));
        softAssert.assertEquals(respJP.get("message"),expectedData.get("message"));
        softAssert.assertEquals(respJP.get("data.id"),expectedData.getJSONObject("data").get("id"));
        softAssert.assertEquals(respJP.get("data.employee_name"),expectedData.getJSONObject("data").get("employee_name"));

        softAssert.assertAll();


    }

}
