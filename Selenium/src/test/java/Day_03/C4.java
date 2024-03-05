package Day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

        int expectedLinkCount = 147;
        int actualLinkCount = linkElements.size();

        if (expectedLinkCount == actualLinkCount) {
            System.out.println("Link Test Passed");
        } else {
            System.out.println("Link Test Failed");
        }


        WebElement productLinkElement = driver.findElement(By.partialLinkText("/products"));
        productLinkElement.click();

        WebElement specialOfferElement = driver.findElement(By.id("sale_image"));
        if (specialOfferElement.isDisplayed()){
            System.out.println("special offer Test Passed");
        }else {
            System.out.println("special offer Test Failed");
        }


        Thread.sleep(15000);
        driver.close();
    }
}
