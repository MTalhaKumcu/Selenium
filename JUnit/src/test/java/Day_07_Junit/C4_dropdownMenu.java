package Day_07_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C4_dropdownMenu {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com");
    }

    @AfterClass
    public static void down() {
        driver.close();
    }

    @Test
    public void test01() {
        WebElement dropDownMenuElementi = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropDownMenuElementi);
        int expectedOptionSize = 45;
        int actualOptionSize = select.getOptions().size();

        Assert.assertEquals(expectedOptionSize, actualOptionSize);
    }

    @Test
    public void test02() {
        WebElement dropDownMenuElementi = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropDownMenuElementi);

        select.selectByVisibleText("Books");
        WebElement searchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchBoxElement.sendKeys("Java"+ Keys.ENTER);

        WebElement resultJava = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(resultJava.getText());

        String expectedContext = "Java";
        String actualContext = resultJava.getText();
        Assert.assertTrue(actualContext.contains(expectedContext));
    }
}
