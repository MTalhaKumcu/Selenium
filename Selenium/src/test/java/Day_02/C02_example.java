package Day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_example {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");


        System.out.println("Page title: "+ driver.getTitle());

        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        String expectedUrl =  "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("handle value is: " + driver.getWindowHandle());

        String expectedWord = "shopping";
        String actualWord = driver.getPageSource();
        if (actualWord.contains(expectedWord)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        Thread.sleep(15000);
        driver.close();
    }
}
