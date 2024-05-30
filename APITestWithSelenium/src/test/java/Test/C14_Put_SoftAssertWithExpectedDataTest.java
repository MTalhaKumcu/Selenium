package Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C14_Put_SoftAssertWithExpectedDataTest {


    @Test
    public void test01() {


        //1- url , request body
        String url = "https://dummy.restapiexample.com/api/v1/update/21";

        JSONObject data = new JSONObject();

        data.put("name", "Ahmet")
                .put("salary", "1230")
                .put("age", "44")
                .put("id", 4);


        JSONObject reqBody = new JSONObject();

        reqBody.put("status","success")
                .put("data",data);


        //2- expected data


        JSONObject expectedData = new JSONObject();
        expectedData.put("status","success")
                .put("data",reqBody)
                .put("message","Successfully! Record has been updated");


        //3- response record


        Response response = given().contentType(ContentType.JSON)
                .when().body(reqBody.toString())
                .put(url);


    }


}
