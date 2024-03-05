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

public class C2_checkBox {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
    public static void teardown() {
        driver.close();
    }

    @Test
    public void Test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        Thread.sleep(3000);
        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }
        Thread.sleep(3000);
        if (!checkBox2.isSelected()) {
            checkBox2.click();
        }

        Assert.assertTrue(checkBox1.isSelected() && checkBox2.isSelected());

    }


}


