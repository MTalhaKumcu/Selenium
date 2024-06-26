package Test;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C10_Get_ResponseBodyTestArrayUsage {


    @Test
    public void test01() {

        //1-URL

        String url = "http://dummy.restapiexample.com/api/v1/employees";

        //2-Expected Dat

        //3-  response saving

        Response response = given().when().put(url);
        response.prettyPrint();

        //4-Assertion

        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json")
                .body("data.id", Matchers.hasSize(24),
                        "data.employee_name", Matchers.hasItem("Ashton Cox"),
                        "data.employee_age", Matchers.hasItems(61, 30, 40));


    }

}
