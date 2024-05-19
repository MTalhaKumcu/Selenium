package Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C05_GET_ResponsBodyTest {
    @Test
    public void get_ResponsBodyTest01() {

        String url = "https://jsonplaceholder.typicode.com/posts/44";

        String expectedData = "";

        Response response = given().when().get(url);
        response.prettyPrint();

        response.then().assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("title", Matchers.equalTo("optio dolor molestias sit"))
                .body("userId", Matchers.equalTo(5));


    }
}
