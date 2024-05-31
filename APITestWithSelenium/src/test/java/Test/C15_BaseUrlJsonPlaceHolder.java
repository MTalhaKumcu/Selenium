package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C15_BaseUrlJsonPlaceHolder extends JsonPlaceHolderBaseUrl {


    @Test
    public void get01() {

        //1- url
        specAppName.pathParam("pp1", "posts");

        //2-expected data
        //3- response

        Response response = given().spec(specAppName)
                .when().get("/{pp1}");

        response.prettyPrint();

        //4- assertion
        response.then().assertThat().statusCode(200).body("title", Matchers.hasSize(100));

    }

    @Test
    public void get02() {

        //1-url
        specAppName.pathParams("pp1", "posts", "pp2", 44);
        //2- expected data
        //3 - response
        Response response = given().spec(specAppName).when().get("/{pp1}/{pp2}");

        //4- assertion
        response.then().assertThat().statusCode(200)
                        .body("title",Matchers.equalTo("optio dolor molestias sit"));

    }

    @Test
    public void delete01() {
        //1- url
        specAppName.pathParams("pp1","posts","pp2",50);
        //2- expected
        //3- response
        Response response = given().spec(specAppName).when().delete("/{pp1}/{pp2}");
        response.prettyPrint();
        //4- assertion
        response.then().assertThat().statusCode(200)
                .body("id",Matchers.nullValue());

    }
}
