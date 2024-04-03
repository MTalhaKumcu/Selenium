package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchCookieException;
import pages.HerokuPage;

public class HerokuStepdefinition {
    HerokuPage herokuPage = new HerokuPage();

    @Then("push add button")
    public void push_add_button() {
        herokuPage.addElementButton.click();
    }

    @Then("wait to see delete button")
    public void wait_to_see_delete_button() {
        //delete butonu implicity wait suresi icinde
        // gorunur oldugundan bu adimda bir islem yapilmadi
    }

    @Then("isDisplay delete button")
    public void is_display_delete_button() {
        Assert.assertTrue(herokuPage.deleteElementButton.isDisplayed());
    }

    @Then("push delete button")
    public void push_delete_button() {
        herokuPage.deleteElementButton.click();
    }

    @Then("isnotDisplay delete button")
    public void isnot_display_delete_button() {
        try {
            Assert.assertTrue(herokuPage.deleteElementButton.isDisplayed());
        } catch (NoSuchCookieException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(true);

    }

}
