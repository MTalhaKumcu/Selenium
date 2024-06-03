package TestData;

import org.json.JSONObject;

public class TestDataHeokuApp {


    public int successCode = 200;

    public JSONObject createBookingdates() {

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2021-06-01")
                .put("checkout", "2021-06-10");

        return bookingdates;
    }

    public JSONObject createBooking() {

        JSONObject booking = new JSONObject();
        booking.put("firstname", "Ali")
                .put("lastname", "Bak")
                .put("totalprice", 500)
                .put("depositpaid", false)
                .put("bookingdates", createBookingdates())
                .put("additionalneeds", "wi-fi");

        return booking;
    }

    public JSONObject createExpectedData(){

        JSONObject expected = new JSONObject();
        expected.put("bookingid",24)
                .put("booking",createBooking());

        return expected;
    }
}