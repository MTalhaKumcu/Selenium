package Test;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C07_GET_Rep {


    @Test
    public void getRepTest01() {

        String url = "https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);

        response.prettyPrint();

        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("firstname" , Matchers.equalTo("Mary"),
                        "lastname", Matchers.equalTo("Wilson"),
                        "totalprice", Matchers.equalTo(928));
    }


}
