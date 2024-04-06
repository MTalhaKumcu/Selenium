package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AePage;
import utilities.Driver;

import java.security.Key;

public class AeStepdefinitions {
    AePage aePage = new AePage();
    Faker faker = new Faker();

    String emailadress;
    Actions actions;
    String userName;

    @And("User click sign up link")
    public void user_click_sign_up_link() {
        if (aePage.consent.isDisplayed()) {
            aePage.consent.click();
        }
        aePage.firstSignUpButton.click();
    }

    @And("User enter username and email in create account")
    public void userEnterAndInCreateAccount() {
        actions = new Actions(Driver.getDriver());

        userName = faker.name().firstName();
        aePage.userName.sendKeys(userName);

        emailadress = faker.internet().emailAddress();
        aePage.eMail.sendKeys(emailadress);


    }

    @And("singUp clicked")
    public void sing_up_clicked() {
        aePage.singUpInCreate.click();
    }

    @And("User enter own information")
    public void user_enter_own_information() {
        actions = new Actions(Driver.getDriver());
        actions.click(aePage.gender)
                .sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("8").sendKeys(Keys.TAB)
                .sendKeys("May").sendKeys(Keys.TAB)
                .sendKeys("1990").sendKeys(Keys.TAB)
                .click(aePage.checkbox1).sendKeys(Keys.TAB)
                .click(aePage.checkbox2).sendKeys(Keys.TAB)
                .sendKeys(userName).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.company().name()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys("Canada").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())

                .perform();


    }

    @And("User create account clicked")
    public void user_create_account_clicked() {
        aePage.createButton.click();
    }

    @Then("is new account enable")
    public void is_new_account_enable() {
        Assert.assertTrue(aePage.account_Created.isDisplayed());

    }


}
