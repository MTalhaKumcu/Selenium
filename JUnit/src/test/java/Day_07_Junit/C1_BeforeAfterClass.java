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

public class C1_BeforeAfterClass {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("https://www.youtube.com");
    }

    @AfterClass
    public static void teardownn() {
        driver.close();
    }

    @Test
    public void titleTest() {
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Test
    public void imageTest() {
        WebElement logoElement = driver.findElement(By.xpath("//*[@id='logo-icon']"));
        Assert.assertTrue(logoElement.isDisplayed());

    }

    @Test
    public void searchBoxTest() {

        WebElement searchBoxElement = driver.findElement(By.xpath("(//*[@id='search'])[3]"));
        Assert.assertTrue(searchBoxElement.isEnabled());

    }

    @Test
    public void wrongTitleTest() {
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        Assert.assertNotEquals(expectedTitle, actualTitle);

    }
}
