package Day_01_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_F01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        // kullanicilarinda .exe olmali ama mac`ler .exe olmaz
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
