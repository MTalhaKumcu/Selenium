package Test;

import BaseUrl.JsonPlaceHolderBaseUrl;
import Pojos.JsonPlaceHolderReqBodyPOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class C25_Put_PojoClass extends JsonPlaceHolderBaseUrl {

    @Test
    public void test01() {
        //1-url , request body
        specAppName.pathParams("pp1", "posts", "pp2", 70);

        JsonPlaceHolderReqBodyPOJO reqBodyPOJO = new JsonPlaceHolderReqBodyPOJO("Ahmet", "Merhaba", 10, 70);
        System.out.println("reqBodyPOJO: " + reqBodyPOJO);

        //2-expected data
        JsonPlaceHolderReqBodyPOJO expedtecData = new JsonPlaceHolderReqBodyPOJO("Ahmet", "Merhaba", 10, 70);

        //3- response
        Response response = given().spec(specAppName).contentType(ContentType.JSON)
                .when().body(reqBodyPOJO).put("/{pp1}/{pp2}");
        //4- assertion

        JsonPlaceHolderReqBodyPOJO reqBodyPOJOs = response.as(JsonPlaceHolderReqBodyPOJO.class);

        assertEquals(expedtecData.getTitle(), reqBodyPOJOs.getTitle());
        assertEquals(expedtecData.getId(), reqBodyPOJOs.getId());

    }

}
