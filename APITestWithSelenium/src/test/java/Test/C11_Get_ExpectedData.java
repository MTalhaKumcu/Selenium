package Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C11_Get_ExpectedData {

    @Test
    public void test01() {
        //1-Url
        String url = "https://jsonplaceholder.typicode.com/posts/22";
        //2-Expected data
        JSONObject expectedData = new JSONObject();
        expectedData.put("userId", 3);
        expectedData.put("id", 22);
        expectedData.put("title", "dolor sint quo a velit explicabo quia nam");
        expectedData.put("body", "eos qui et ipsum ipsam suscipit aut nsed omnis non odio nexpedita ear um mollitia molestiae aut atque rem suscipit nnam impedit esse");

        System.out.println("expected data : "+expectedData);

        //3-Response
        Response response = given().when().get(url);

        response.prettyPrint();
        // response.prettyPeek();
        //prettyPrintten farki olarak size response ile ilgili tum degerleri dondurur

        JsonPath jsonPath = response.jsonPath();

        Assert.assertEquals(expectedData.get("userId"),jsonPath.get("userId"));

        //4-Assertion


    }


}
