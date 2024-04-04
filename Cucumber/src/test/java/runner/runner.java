package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@qd",//Work in Progress @wip
        dryRun = false
)
public class runner {

}
