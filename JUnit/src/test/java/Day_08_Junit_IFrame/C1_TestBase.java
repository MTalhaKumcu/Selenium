package Day_08_Junit_IFrame;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C1_TestBase extends TestBase {
    @Test
    public void test01() {
        driver.get("https://amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella"+ Keys.ENTER);

        String expectedContent = "nutella";
        String actualContent = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
        Assert.assertTrue(actualContent.contains(expectedContent));
    }


}
