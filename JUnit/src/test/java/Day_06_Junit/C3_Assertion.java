package Day_06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3_Assertion {
    WebDriver driver;

    @Test
    public void googleTest() throws InterruptedException {

        haveTo();
        driver.get("https://google.com");

        String expectedTitle = "google";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedTitle));

        driver.close();
    }

    @Test
    public void wiseTest() throws InterruptedException {

        haveTo();
        driver.get("https://wisequarter.com");

        String expectedTitle = "wisequarter";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedTitle));

        driver.close();
    }

    @Test
    public void amazonTest() throws InterruptedException {

        haveTo();
        driver.get("https://amazon.com");

        String expectedTitle = "amazon";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedTitle));

        driver.close();

    }

    @Test
    public void amazonLogo() throws InterruptedException {
        haveTo();
        driver.get("https://amazon.com");
        WebElement logoElement = driver.findElement(By.id("nav-logo-sprites"));

        Assert.assertTrue(logoElement.isDisplayed());

        driver.close();
    }

    public void haveTo() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

}
