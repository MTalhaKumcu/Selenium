package Test;

import org.json.JSONObject;
import org.junit.Test;

import java.security.PublicKey;

public class C03_JSONObjectsCreation {


    @Test
    public void jsonObj01() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "Ahmet");
        jsonObject.put("body", "Merhaba");
        jsonObject.put("userId", 1);

        System.out.println("json obj ==> " + jsonObject);
    }

    //Nested JSON Object
    @Test
    public void jsonObj02() {
        JSONObject innerJson = new JSONObject();
        innerJson.put("checkin", "2018-01-01");
        innerJson.put("checkout", "2019-01-01");

        JSONObject outherJson = new JSONObject();
        outherJson.put("firstname", "Jim");
        outherJson.put("additionalneeds", "Breakfast");
        outherJson.put("bookingdates", innerJson);
        outherJson.put("totalprice", 111);
        outherJson.put("depositpaid", true);
        outherJson.put("lastname", "Brown");

        System.out.println("outher Json" +outherJson);


    }

}
