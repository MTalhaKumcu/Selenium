package Day_11_Waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C1_SeleniumWaits_WebTables extends TestBase {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement itsgone = driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(itsgone.isDisplayed());

        driver.findElement(By.xpath("//button[text()='Add']")).click();
        WebElement itsbackText = driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(itsbackText.isDisplayed());

    }

}
