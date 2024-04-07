package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target\\usercompany.html",
                "json:target\\json-reports\\usercompany.json",
                "junit:target\\xml-report\\usercompany.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@test2" ,
        dryRun = false

)
public class DemoGuruRunner {

}
