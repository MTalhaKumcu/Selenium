package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoguruStepdefinition {

    DemoGuruPage demoGuruPage = new DemoGuruPage();
    List<String> companyList;

    @And("guru99 cookies accept")
    public void guruCookiesAccept() {
        Driver.getDriver().switchTo().frame(demoGuruPage.iframeCookies);
        demoGuruPage.cookies.click();

    }

    @Then("Write Company in console")
    public void write_company_in_console() {
        companyList = ReusableMethods.stringListeCevir(demoGuruPage.companyElementList);
        System.out.printf(String.valueOf(companyList));
    }


    @And("{string} is enable in the list")
    public void isEnableInTheList(String requiredCompany) {
        Assert.assertTrue(companyList.contains(requiredCompany));

    }
}
