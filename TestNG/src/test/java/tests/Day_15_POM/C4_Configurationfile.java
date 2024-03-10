package tests.Day_15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C4_Configurationfile {


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(ConfigurationReader.getProperty("amazonSearchText"));
        amazonPage.searchBox.submit();

        String expectedContent = ConfigurationReader.getProperty("expetedText");
        String actualContent = amazonPage.result.getText();

        Assert.assertTrue(actualContent.contains(expectedContent));

        Driver.closeDriver();
    }

}
