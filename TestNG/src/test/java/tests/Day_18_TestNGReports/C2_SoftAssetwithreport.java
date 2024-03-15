package tests.Day_18_TestNGReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class C2_SoftAssetwithreport extends TestBaseReport {

    @Test
    public void amazonPage() {
        extentTest = extentReports.createTest("amazon Test");

        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        String expectedText = ConfigurationReader.getProperty("amazonTitle");
        String actualText = Driver.getDriver().getCurrentUrl();
        extentTest.info("amazon title test ");
        Assert.assertTrue(actualText.contains(expectedText));
        extentTest.info("test passed");
        Driver.quitDriver();
        extentTest.info("quit");
    }

    @Test
    public void wiseQuarter() {
        extentTest = extentReports.createTest("wise quarter test");
        Driver.getDriver().get(ConfigurationReader.getProperty("wiseUrl"));
        String expectedText = ConfigurationReader.getProperty("wiseTitle");
        String actualText = Driver.getDriver().getCurrentUrl();
        extentTest.info("test made for wisequarter");
        Assert.assertTrue(actualText.contains(expectedText));
        extentTest.pass("wise test passed");
        Driver.closeDriver();
        extentTest.info("quit");
    }

    @Test
    public void facebookTitle() {
        extentTest = extentReports.createTest("facebook test");
        Driver.getDriver().get(ConfigurationReader.getProperty("facebookUrl"));
        String expectedText = ConfigurationReader.getProperty("facebookTitle");
        String actualText = Driver.getDriver().getCurrentUrl();
        extentTest.info("facebook title test");
        Assert.assertTrue(actualText.contains(expectedText));
        extentTest.info("facebook test passed");
        Driver.quitDriver();
        extentTest.info("quit");
    }
}

