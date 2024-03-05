package Day_06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C2_Assert {
    WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
        haveTo();
        driver.get("https://amazon.com");

        String expectedTitle = "AMAZON";
        String actualTitle = driver.getTitle();

        /* if(actualTitle.contains(expectedTitle))
        {
            System.out.println("Title Test Passed");
        }else {
            System.out.println("actual title"+ actualTitle);
            System.out.println("Title Test Failed");
        }*/

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        close();
    }

    public void haveTo() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
