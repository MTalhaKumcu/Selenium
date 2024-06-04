package Test;

import BaseUrl.HerokuAppBaseUrl;
import Pojos.BookingPOJO;
import Pojos.BookingdatesPOJO;
import Pojos.HerokuAppExpDataPOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class C28_Post_Pojo extends HerokuAppBaseUrl {

    @Test
    public void test01() {
        // url
        specHerokuApp.pathParam("pp1", "booking");
        //expected data
        BookingdatesPOJO bookingdates = new BookingdatesPOJO("2021-06-01", "2021-06-10");
        BookingPOJO reqbody = new BookingPOJO("Ali", "Bak", 500, false, bookingdates, "wi-fi");
        HerokuAppExpDataPOJO expDataPOJO = new HerokuAppExpDataPOJO(24, reqbody);
        //responce
        Response response = given().spec(specHerokuApp).contentType(ContentType.JSON)
                .when().body(reqbody).post("/{pp1}");
        response.prettyPrint();
        //assertion
        HerokuAppExpDataPOJO respPojo = response.as(HerokuAppExpDataPOJO.class);

        assertEquals(expDataPOJO.getBooking().getFirstname, respPojo.getBooking().getFirstname());
    }

}
