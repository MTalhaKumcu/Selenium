package BaseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class DummyBaseUrl {

    protected RequestSpecification specOfDummyUrl;

    @Before
    public void setup01(){
        specOfDummyUrl = new RequestSpecBuilder()
                .setBaseUri("http://dummy.restapiexample.com").build();
    }
}
