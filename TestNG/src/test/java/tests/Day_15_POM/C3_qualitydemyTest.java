package tests.Day_15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C3_qualitydemyTest {

    @Test
    public void qualitydemyTest(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        qualitydemyPage.login.click();
        qualitydemyPage.email.sendKeys("selenium");
        qualitydemyPage.password.sendKeys("heyecandir");

        qualitydemyPage.secondLogin.click();

        Assert.assertTrue(qualitydemyPage.email.isEnabled());

        Driver.closeDriver();
    }
}
