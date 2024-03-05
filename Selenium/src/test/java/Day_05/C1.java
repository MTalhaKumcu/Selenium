package Day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdirver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement nyc = driver.findElement(By.id("pid3_thumb"));
        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc));
        if (berlin1.getAttribute("id").equals("pid7_thumb")) {
            System.out.println("berlin 1 passed");
        } else {
            System.out.println("berlin 1 failed");
        }

        WebElement mountei = driver.findElement(By.id("pid10_thumb"));
        WebElement amsterdam = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(mountei));
        if (amsterdam.getAttribute("id").equals("pid9_thumb")) {
            System.out.println("amsterdam passed");
        } else {
            System.out.println("amsterdam failed");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
