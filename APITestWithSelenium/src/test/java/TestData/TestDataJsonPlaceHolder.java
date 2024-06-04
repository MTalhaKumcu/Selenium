package TestData;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Objects;

public class TestDataJsonPlaceHolder {

    public int successCode = 200;
    public String contentType = "application/json; charset=utf-8";
    public String connecitonValue = "keep-alive";

    public HashMap<String, Object> createRequestBody() {
        HashMap<String, Object> reqBody = new HashMap<>();
        reqBody.put("title", "Ahmet");
        reqBody.put("body", "Merhaba");
        reqBody.put("userId", 10);
        reqBody.put("id", 70);

        return reqBody;
    }
    public JSONObject expectedData() {
        JSONObject expectedData = new JSONObject();
        expectedData.put("userId", 3)
                .put("id", 22)
                .put("title", "dolor sint quo a velit explicabo quia nam")
                .put("body", "eos qui et ipsum ipsam suscipit aut sed omnis non odio expedita ear um mollitia molestiae aut atque rem suscipit nam impedit esse");
        return expectedData;
    }

    public JSONObject createRequestBodyJson() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Ahmet")
                .put("body", "Merhaba")
                .put("userId", 10)
                .put("id", 70);
        return requestBody;
    }




}
