package Day_03;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");
        List<WebElement> categoryElementsList = driver.findElements(By.className("panel-title"));
        int expectedSize = 3;
        int actualSize = categoryElementsList.size();

        if (expectedSize==actualSize) {
            System.out.println("Category element Test Passed");
        } else {
            System.out.println("Category element Test Failed");

        }

        for (WebElement eachElement: categoryElementsList)
        {
            System.out.println(eachElement.getText()+" ");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
