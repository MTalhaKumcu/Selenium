package Day_09_NewWindow_ActionClass;

import Utilities.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class C2_SwitchingWindows extends TestBase {

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/windows");
        String firstPageWHV = driver.getWindowHandle();
        WebElement h3Element = driver.findElement(By.tagName("h3"));
        String expectedtext = "Opening a new window";
        String actualText = h3Element.getText();
        Assert.assertEquals(expectedtext, actualText);


        String expectedTitle = "The Internet";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualPageTitle);

        //driver.findElement(By.xpath("//*[text()='Click Here']")).click();
        driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();

        Set<String> WHCSets = driver.getWindowHandles();
        String secondWHV = "";
        for (String eachWHV : WHCSets
        ) {
            if (!eachWHV.equals(firstPageWHV)) {
                secondWHV = eachWHV;
            }
        }
        driver.switchTo().window(secondWHV);
        System.out.println(driver.getTitle());

        expectedTitle = "New Window";
        actualPageTitle =driver.getTitle();
        Assert.assertEquals(expectedTitle,actualPageTitle);

        WebElement secondH3 = driver.findElement(By.tagName("h3"));
        String sExpectedtext ="New Window";
        String sActualText = secondH3.getText();
        Assert.assertEquals(sExpectedtext,sActualText);

        driver.switchTo().window(firstPageWHV);
        Assert.assertEquals(expectedtext,actualText);

    }

}
