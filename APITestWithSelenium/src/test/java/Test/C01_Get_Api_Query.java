package Test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_Api_Query {

    @Test
    public void get01(){
        String url = "https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);
        //restassured lib
        response.prettyPrint();
        System.out.println("status code "+response.getStatusCode());
        System.out.println("Content Type "+response.getContentType());
        System.out.println("Header "+response.getHeader("server"));
        System.out.println("Status Line "+response.getStatusLine());
        System.out.println("Response Time "+response.getTime());

    }
}
