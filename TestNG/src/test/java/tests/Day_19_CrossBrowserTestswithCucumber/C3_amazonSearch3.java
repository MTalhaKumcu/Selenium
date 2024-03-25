package tests.Day_19_CrossBrowserTestswithCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C3_amazonSearch3 extends TestBaseCross {
    @Test
    public void amazongPage3() {
        driver.get("https://amazon.com");
        WebElement searchbox = driver.findElement(By.id("twotabsearchbox"));
        searchbox.sendKeys("nutella" + Keys.ENTER);


        String expectedText = "nutella";
        WebElement searchboxElement = driver.findElement(By.xpath("//div[@class='sg-col-inner'])[1]"));
        String actualText = searchboxElement.getText();
        Assert.assertTrue(actualText.contains(expectedText));

    }
}
