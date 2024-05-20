package Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C06_Post_Request {

    @Test
    public void postReq01() {

        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject reqBody = new JSONObject();

        reqBody.put("title", "API")
                .put("body", "API ogrenmek ne guzel")
                .put("userId", 10);

        System.out.println("reqBody" + reqBody);

        Response response = given().contentType(ContentType.JSON)
                .when().body(reqBody.toString())
                .post(url);

        response.then().assertThat().statusCode(201)
                .contentType("application/json")
                .body("title" , Matchers.equalTo("API"))
                .body("userId" ,Matchers.lessThan(100))
                .body("body", Matchers.containsString("API"));


    }

}
