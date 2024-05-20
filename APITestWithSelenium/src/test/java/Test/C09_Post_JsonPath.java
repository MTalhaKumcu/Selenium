package Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C09_Post_JsonPath {
    @Test
    public void post_JsonPathTest01() {


        String url = "https://restful-booker.herokuapp.com/booking";

        JSONObject bookingDates = new JSONObject();

        bookingDates.put("chechkin", "2021-06-01");
        bookingDates.put("checkout", "2021-06-10");

        JSONObject booking = new JSONObject();

        booking.put("firstname", "Ali");
        booking.put("lastname", "Bak");
        booking.put("totalprice", 500);
        booking.put("bookingdates", bookingDates);
        booking.put("additionalneeds", "wi-fi");

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .body(booking.toString())
                .post(url);


        response.prettyPrint();


        response.then()
                .assertThat().statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("booking.firstname", Matchers.equalTo("Ali"),
                        "booking.lastname", Matchers.equalTo("Bak"),
                        "booking.totalprice", Matchers.equalTo(500),
                        "booking.firstname", Matchers.equalTo("Ali"),
                        "booking.additionalneeds", Matchers.equalTo("wi-fi"),
                        "booking.bookingDates.chechkin", Matchers.equalTo("2021-06-01"),
                        "booking.bookingDates.checkout", Matchers.equalTo("2021-06-10"));


    }

}
