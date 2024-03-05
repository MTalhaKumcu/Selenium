package Day_08_Junit_IFrame;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C2_JSAlert extends TestBase {

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        String expectedAlert = "I am a JS Alert";
        String actualAlert = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlert, actualAlert);

        driver.switchTo().alert().accept();


    }

    @Test
    public void test02() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String expectedAlertCancel = "You clicked: Cancel";
        String actualAlert = driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertEquals(expectedAlertCancel, actualAlert);

    }
    @Test
    public void test03(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Talha");
        driver.switchTo().alert().accept();
        String expectedText = "You entered: Talha";
        String actualText = driver.findElement(By.xpath("//*[@id='result']")).getText();

        Assert.assertEquals(expectedText,actualText);
    }

}
