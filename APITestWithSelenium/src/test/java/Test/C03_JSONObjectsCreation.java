package Test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JSONObjectsCreation {


    @Test
    public void jsonObj01() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "Ahmet");
        jsonObject.put("body", "Merhaba");
        jsonObject.put("userId", 1);

        System.out.println("json obj ==> "+jsonObject);
    }

}
