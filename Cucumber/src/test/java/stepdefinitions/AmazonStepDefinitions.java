package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

}
