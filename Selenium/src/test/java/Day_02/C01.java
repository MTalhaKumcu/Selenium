package Day_02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());


        System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        //acilan her pencereye verilen unit hash code degeridir veya bir den fazla windos/tab lerin
        // unique hash coedlarini bir set(String) olarak geritirir

        Thread.sleep(5000);
        driver.close();

    }
}
