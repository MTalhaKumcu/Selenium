package Day_13_ExcelAutomation;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class C3_ScreenShot extends TestBase {

    @Test
    public void test01() throws IOException {

        driver.get("https://amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella"+ Keys.ENTER);

        WebElement text = driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));
        String expectedText = "nutella";
        String actualText = text.getText();

        Assert.assertTrue(actualText.contains(expectedText));

        TakesScreenshot tss = (TakesScreenshot) driver;
        File wholePageSS = new File("target/ScreenShot/wholePageSS.png");
        File temporarySS = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temporarySS,wholePageSS);
    }
}
