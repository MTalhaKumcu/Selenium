package Day_13_ExcelAutomation;

import Utilities.ReusableMethod;
import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class C4_WebElementSS extends TestBase {

    @Test
    public void test01() throws IOException {
        driver.get("https://amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("smile" + Keys.ENTER);

        WebElement textElement = driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));
        String expectedText = "smile";
        String actuallText = textElement.getText();

        Assert.assertTrue(actuallText.contains(expectedText));

        ReusableMethod.webelementSS(driver,textElement);
        ReusableMethod.wholePageSS(driver);


    }

}
