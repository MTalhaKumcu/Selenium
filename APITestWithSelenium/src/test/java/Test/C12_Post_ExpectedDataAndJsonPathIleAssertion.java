package Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class C12_Post_ExpectedDataAndJsonPathIleAssertion {

    @Test
    public void test01() {

        //1- url
        String url = "https://restful-booker.herokuapp.com/booking";

        JSONObject bookingDate = new JSONObject();

        bookingDate.put("checkin", "2021-06-01");
        bookingDate.put("checkout", "2021-06-10");

        JSONObject reqBody = new JSONObject();

        reqBody.put("firstname", "ahmet");
        reqBody.put("lastname", "Bulut");
        reqBody.put("totalprice", 500);
        reqBody.put("depositpaid", false);
        reqBody.put("bookingdates", bookingDate);
        reqBody.put("additionalneeds", "wi-fi");

        //2- expected data

        JSONObject expecteDate = new JSONObject();
        expecteDate.put("bookingfid", 24);
        expecteDate.put("booking", reqBody);


        //3- response
        Response response = given().contentType(ContentType.JSON)
                .when()
                .body(reqBody.toString())
                .post(url);

        response.prettyPrint();

        //4- assertion

        JsonPath respJsonPath = response.jsonPath();

        assertEquals(expecteDate.getJSONObject("booking").get("firstname"),
                     respJsonPath.get("booking.firstname"));
        assertEquals(expecteDate.getJSONObject("booking").get("lastname"),
                respJsonPath.get("booking.lastname"));


    }
}
