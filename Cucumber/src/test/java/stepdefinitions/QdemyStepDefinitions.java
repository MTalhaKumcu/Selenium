package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QdemyStepDefinitions {
    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Given("User goes to qd webpage")
    public void user_goes_to_qd_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
    }

    @Then("click first login link")
    public void click_first_login_link() {
        qualitydemyPage.firstLoginButton.click();
    }

    @Then("user enter email{string}")
    public void user_enter_email(String userEmail) {
        qualitydemyPage.eMail.sendKeys(userEmail);
    }

    @Then("user enter password{string}")
    public void user_enter_password(String userPassword) {
        qualitydemyPage.passwordBox.sendKeys(userPassword);
    }

    @When("click login button")
    public void click_login_button() {
        qualitydemyPage.loginButton.click();
    }

    @Then("isEnable to enter")
    public void is_enable_to_enter() {
        Assert.assertTrue(qualitydemyPage.eMail.isEnabled());
    }
}
