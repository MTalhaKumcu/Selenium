package BaseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification specAppName;

    @Before
    public void setUp() {
        specAppName = new RequestSpecBuilder()
                        .setBaseUri("https://jsonplaceholder.typicode.com")
                        .build();
    }
}
