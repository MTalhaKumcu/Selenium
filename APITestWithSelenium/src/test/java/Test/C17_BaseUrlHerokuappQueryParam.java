package Test;

import BaseUrl.HerokuAppBaseUrl;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C17_BaseUrlHerokuappQueryParam extends HerokuAppBaseUrl {


    @Test
    public void get01() {
        //1-url
        specHerokuApp.pathParam("pp1", "booking");

        //2-expected
        //3-response
        Response response = given().spec(specHerokuApp)
                .when().get("/{pp1}");

        response.prettyPrint();
        //4-assertion
        response.then().assertThat().statusCode(200)
                .body("bookingid", Matchers.hasItem(88));

    }

    @Test
    public void get02() {
        //1-url
        //2-expected
        //3-response
        //4-assertion
    }

    @Test
    public void get03() {
        //1-url
        //2-expected
        //3-response
        //4-assertion
    }

}
