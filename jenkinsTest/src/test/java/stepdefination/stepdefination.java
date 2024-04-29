package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.instagram_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class stepdefination {
    instagram_Page instagramPage = new instagram_Page();

    @Given("go to {string} page")
    public void go_to_instagram_page() {
        Driver.getDriver().get(ConfigReader.getProperties("instaUrl"));
    }
    @When("accept cookies")
    public void accept_cookies() {

    }
    @Then("click singUp")
    public void click_sing_up() {

    }
    @Then("fill {string} requirements")
    public void fill_requirements(String string) {

    }
    @Then("click account info next button")
    public void click_account_info_next_button() {

    }
    @Then("click birthday next button")
    public void click_birthday_next_button() {

    }
    @Then("Close page")
    public void close_page() {

    }
}
