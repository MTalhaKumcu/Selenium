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

public class C4_Assertions {
    WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
        haveTo();
        String expectedURL = "https://www.bestbuy.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

        Thread.sleep(5);
        driver.close();
    }

    @Test
    public void test02() throws InterruptedException {

        haveTo();

        String expectedTitle = "Rest";
        String actualTitle = driver.getTitle();

        Assert.assertFalse(actualTitle.contains(expectedTitle));

        Thread.sleep(5);
        driver.close();

    }

    @Test
    public void test03() throws InterruptedException {
        haveTo();

        WebElement logoElement = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logoElement.isDisplayed());
        Thread.sleep(5);
        driver.close();
    }
    public void haveTo() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.bestbuy.com/");

    }
}
