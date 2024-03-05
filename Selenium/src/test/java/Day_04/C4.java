package Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        driver.navigate().refresh();

        String expectedTitle = "";
        String actialTitle = driver.getTitle();

        if (actialTitle.contains(expectedTitle)) {
            System.out.println("ilk test passed");

        } else {
            System.out.println("ilk test failed");
        }
        Thread.sleep(5000);
        driver.close();

    }
}
