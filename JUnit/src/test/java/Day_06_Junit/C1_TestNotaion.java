package Day_06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C1_TestNotaion {
    WebDriver driver;

    @Test
    public void googleTest() throws InterruptedException {

        haveTo();
        driver.get("https://google.com");

        String expectedTitle = "google";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedTitle)) {
            System.out.println("Google Test Passed");
        } else {
            System.out.println("Google Test Failed");
        }
    }

    @Test
    public void wiseTest() throws InterruptedException {

        haveTo();
        driver.get("https://wisequarter.com");

        String expectedTitle = "wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedTitle)) {
            System.out.println("wise Test passed");
        } else {
            System.out.println("wise Test failed");
        }
        close();
    }

    @Test
    public void amazonTest() throws InterruptedException {

        haveTo();
        driver.get("https://amazon.com");

        String expectedTitle = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedTitle)) {
            System.out.println("amazon Test passed");
        } else {
            System.out.println("amazon Test failed");
        }

    }

    @Test
    public void amazonLogo() throws InterruptedException {
        haveTo();
        driver.get("https://amazon.com");
        WebElement logoElement = driver.findElement(By.id("nav-logo-sprites"));
        if (logoElement.isDisplayed()) {
            System.out.println("Amazon logo Test Passed");
        } else {
            System.out.println("Amazon logo Test Failed");
        }

        close();
    }

    public void haveTo() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void close() throws InterruptedException {
        Thread.sleep(15);
        driver.close();
    }
}
