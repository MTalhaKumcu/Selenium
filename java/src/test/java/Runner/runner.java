package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/resources",
        glue = "stepDefinition",
        tags = "@deletequery02",
                //"@deletequery01",
                //"@insertquery01",
                //" @update02",
                //"update01",
                //"@query02",//"@query01",
                dryRun=false

)

public class runner {
}
