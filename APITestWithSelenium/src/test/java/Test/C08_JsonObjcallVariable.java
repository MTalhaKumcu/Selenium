package Test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C08_JsonObjcallVariable {


    @Test
    public void jsonPath() {
        JSONObject cell = new JSONObject();
        JSONObject homeTel = new JSONObject();

        cell.put("type", "iPhone").put("number", "0123-4567-8888");
        homeTel.put("type", "home").put("number", "0123-4567-8910");

        JSONArray phoneNumbers = new JSONArray();

        phoneNumbers.put(0, cell)
                .put(1, homeTel);


        JSONObject address = new JSONObject();

        address.put("streetAddress ", "Yenimahalle kurtulus cad")
                .put("city", "Ankara")
                .put("postalCode", "06100");

        JSONObject outerJSON = new JSONObject();

        outerJSON.put("firstName", "smt")
                .put("lastName", "another")
                .put("age", 10)
                .put("address", address)
                .put("phoneNumbers", phoneNumbers);

        System.out.println("person info: " + outerJSON);


    }

}
