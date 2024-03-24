package tests.Day_18_TestNGReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class C3_DataProvider {



    @DataProvider
    public static Object[][] searchingList() {

        String[][] searchingList ={{"Java"},{"apple"},{"samsung"}};
        return searchingList;
    }

    @Test(dataProvider = "searchingList")
    public void test01(String searchWord) {

        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(searchWord + Keys.ENTER);
        String actualText  = amazonPage.result.getText();
        String expectedText = searchWord ;


        Assert.assertTrue(actualText.contains(expectedText));
        Driver.closeDriver();
    }
}
