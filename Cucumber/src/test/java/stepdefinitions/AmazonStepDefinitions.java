package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    Amazonpage amazonpage = new Amazonpage();

    @Given("User goes to amazon webpage")
    public void user_goes_to_amazon_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("Make searched nutella")
    public void make_searched_nutella() {
        amazonpage.searchBox.sendKeys("nutella" + Keys.ENTER);
    }

    @Then("Make test result of nutella")
    public void make_test_result_of_nutella() {
        String actualTextResult = amazonpage.result.getText();
        String expectedText = "nutella";
        Assert.assertTrue(actualTextResult.contains(expectedText));
    }

    @Then("Close page")
    public void close_page() {
        Driver.closeDrive();
    }

    @Then("Make test result of java")
    public void make_test_result_of_java() {
        String actualTextResult = amazonpage.result.getText();
        String expectedText = "java";
        Assert.assertTrue((actualTextResult.contains(expectedText)));
    }

    @When("Make searched java")
    public void make_searched_java() {
        amazonpage.searchBox.sendKeys("java" + Keys.ENTER);
    }


    @When("Make searched samsung")
    public void Make_searched_samsung() {
        amazonpage.searchBox.sendKeys("samsung" + Keys.ENTER);
    }

    @Then("Make test result of samsung")
    public void Make_test_result_of_samsung() {
        String actualTextResult = amazonpage.result.getText();
        String expectedText = "samsung";
        Assert.assertTrue((actualTextResult.contains(expectedText)));
    }


    @Then("Control title contain amazon")
    public void controlTitleContainAmazon() {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle = "amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
