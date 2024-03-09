package Day_14_JSExecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C1_JSExecuter  extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        driver.get("https://www.wisequarter.com");
       WebElement exploreElement=  driver.findElement(By.xpath("(//*[@class='elementskit-btn whitespace--normal'])[2]"));
       //exploreElement.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",exploreElement);

        jse.executeScript("arguments[0].click()",exploreElement);

        jse.executeScript("alert('deneme')");

        Thread.sleep(5000);



    }
}
