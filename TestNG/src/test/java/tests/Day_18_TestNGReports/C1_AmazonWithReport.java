package tests.Day_18_TestNGReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class C1_AmazonWithReport extends TestBaseReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("amazon search text",
                "search for the desired word");
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        extentTest.info("visit amazon");

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(ConfigurationReader.getProperty("actualText") + Keys.ENTER);
        extentTest.info("nutella has written and searched");

        Assert.assertTrue(ConfigurationReader.getProperty("actualText").contains(ConfigurationReader.getProperty("expetedText")));
        extentTest.pass("Test Passed");


        Driver.quitDriver();

    }


}
