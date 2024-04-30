package stepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.instagram_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class stepdefination {
    instagram_Page instagramPage = new instagram_Page();
    Faker faker = new Faker();
    String userEmail;
    String userFullName;
    String userAllias;
    String password;


    @Given("go to instaUrl page")
    public void go_to_instaUrl_page() {
        Driver.getDriver().get(ConfigReader.getProperties("instaUrl"));

    }

    @When("accept cookies")
    public void accept_cookies() {
        instagramPage.allowCookies.click();
    }

    @Then("click singUp")
    public void click_sing_up() {

        instagramPage.singUp.click();

    }

    @Then("fill user account info requirements")
    public void fill_user_account_info_requirements() {


        userEmail = faker.internet().emailAddress();
        instagramPage.userEmail.sendKeys(userEmail);

        userFullName = faker.name().fullName();
        instagramPage.userFullName.sendKeys(userFullName);

        userAllias = faker.funnyName().name();
        instagramPage.userAllias.sendKeys(userAllias);

        password = faker.internet().password();
        instagramPage.userPassword.sendKeys(password);


    }

    @Then("click account info next button")
    public void click_account_info_next_button() {


    }

    @Then("fill {string} requirements")
    public void fill_requirements(String string) {

    }

    @Then("click birthday next button")
    public void click_birthday_next_button() {

    }

    @Then("Close page")
    public void close_page() {

    }
}
