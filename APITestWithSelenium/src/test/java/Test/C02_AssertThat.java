package Test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_AssertThat {

    @Test
    public void test01() {

        String url = "https://restful-booker.herokuapp.com/booking/10";
        int expecteData = 200;
        Response response = given().when().get(url);
        response.prettyPrint();
        response.then().assertThat()
                .statusCode(expecteData)
                .contentType("application/json; charset=utf-8")
                .header("Server","Cowboy")
                .statusLine("HTTP/1.1 200 OK");// give expectedData

        System.out.println("Test Passed");
    }
}
