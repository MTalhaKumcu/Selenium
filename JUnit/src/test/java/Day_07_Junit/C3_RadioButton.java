package Day_07_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3_RadioButton {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("https://www.facebook.com");
    }

    @AfterClass
    public static void teardownn() {
        driver.close();
    }

    @Test
    public void facebookTest() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
        WebElement radioFemale = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement radioMale = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement radioOther = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

        radioMale.click();

        Assert.assertTrue(radioMale.isSelected());
        Assert.assertFalse(radioFemale.isSelected());
        Assert.assertFalse(radioOther.isSelected());
    }

}
