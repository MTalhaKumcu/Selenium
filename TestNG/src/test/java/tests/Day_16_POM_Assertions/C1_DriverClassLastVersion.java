package tests.Day_16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C1_DriverClassLastVersion {


    @Test
    public void amazonPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        String expectedText = ConfigurationReader.getProperty("amazonTitle");
        String actualText = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualText.contains(expectedText));
        Driver.quitDriver();
    }

    @Test
    public void wiseQuarter() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wiseUrl"));
        String expectedText = ConfigurationReader.getProperty("wiseTitle");
        String actualText = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualText.contains(expectedText));
        Driver.closeDriver();
    }

    @Test
    public void facebookTitle() {
        Driver.getDriver().get(ConfigurationReader.getProperty("facebookUrl"));
        String expectedText = ConfigurationReader.getProperty("facebookTitle");
        String actualText = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualText.contains(expectedText));
        Driver.quitDriver();
     }
}
