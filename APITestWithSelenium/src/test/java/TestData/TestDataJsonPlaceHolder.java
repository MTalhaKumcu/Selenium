package TestData;

import org.json.JSONObject;

public class TestDataJsonPlaceHolder {

    public int successCode = 200;


    public JSONObject expectedData() {
        JSONObject expectedData = new JSONObject();
        expectedData.put("userId", 3)
                .put("id", 22)
                .put("title", "dolor sint quo a velit explicabo quia nam")
                .put("body", "eos qui et ipsum ipsam suscipit aut sed omnis non odio expedita ear um mollitia molestiae aut atque rem suscipit nam impedit esse");
        return expectedData;
    }
}
