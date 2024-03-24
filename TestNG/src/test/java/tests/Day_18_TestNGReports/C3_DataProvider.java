package tests.Day_18_TestNGReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C3_DataProvider {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(ConfigurationReader.getProperty("neededWord")+ Keys.ENTER);
        String actualText  = amazonPage.result.getText();
        String expectedText = ConfigurationReader.getProperty("expetedText");


        Assert.assertTrue(actualText.contains(expectedText));
        Driver.closeDriver();
    }
}
