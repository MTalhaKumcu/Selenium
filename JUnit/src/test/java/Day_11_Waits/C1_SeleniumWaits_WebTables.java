package Day_11_Waits;

import Utilities.TestBase;
import Utilities.TestBaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C1_SeleniumWaits_WebTables {
    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement itsgone = driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(itsgone.isDisplayed());

        driver.findElement(By.xpath("//button[text()='Add']")).click();
        WebElement itsbackText = driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(itsbackText.isDisplayed());

        driver.close();
    }

    @Test
    public void explicitlyWaitTest02() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement itsgoneElement =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertTrue(itsgoneElement.isDisplayed());

        WebElement itsbackElement =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        driver.close();
    }

}
