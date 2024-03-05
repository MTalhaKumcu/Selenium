package Day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.instagram.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();

    }
}
