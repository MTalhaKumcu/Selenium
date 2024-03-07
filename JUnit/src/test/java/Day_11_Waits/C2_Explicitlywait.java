package Day_11_Waits;

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

public class C2_Explicitlywait {
    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement textBoxElement = driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertTrue(textBoxElement.isDisplayed());

        driver.findElement(By.xpath("//*[text()='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(textBoxElement));

        WebElement itsEnableElement = driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(itsEnableElement.isDisplayed());




        driver.close();
    }
}
