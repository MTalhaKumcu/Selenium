package TestData;

import org.json.JSONObject;

import java.util.HashMap;

public class TestDataDummy {
    public int successCode = 200;
    public String contenTypr = "application/json";


    public HashMap expectedDataInner() {

        HashMap<String, Object> data = new HashMap<>();
        data.put("id", 3);
        data.put("employee_name", "Ashton Cox");
        data.put("employee_salary", 86000);
        data.put("employee_age", 66);
        data.put("profile_image", "");

        return data;
    }


    public HashMap expectedData() {
        HashMap<String, Object> expBody = new HashMap<>();
        expBody.put("status", "success");
        expBody.put("data", expectedDataInner());
        expBody.put("message", "Successfully! Record has been fetched.");

        return expBody;
    }


}
