package BaseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerokuAppBaseUrl {

    protected RequestSpecification specHerokuApp;

    @Before
    public void setUp() {
        specHerokuApp = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .build();


    }

}
