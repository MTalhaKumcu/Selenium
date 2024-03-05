package Day_05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");

        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        System.out.println("signin button passed");

        WebElement loginElement = driver.findElement(By.xpath("//input[@id='user_login']"));
        loginElement.sendKeys("username");
        System.out.println("username passed");

        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordElement.sendKeys("password");
        System.out.println("password passed");

        driver.findElement(By.xpath("//input[@name='submit']")).click();
        System.out.println("sign in passed");

        driver.navigate().back();
        System.out.println("back passed");
        driver.findElement(By.xpath("//*[@id='onlineBankingMenu']")).click();
        System.out.println("online banking clicked");
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        System.out.println("pay bills passed");

        WebElement amountElement = driver.findElement(By.xpath("//input[@id='sp_amount']"));
        amountElement.sendKeys("100");
        System.out.println("amount passed");

        WebElement dateElement = driver.findElement(By.xpath("//input[@id='sp_date']"));
        dateElement.sendKeys("2020-09-10");
        System.out.println("date element passed");

        driver.findElement(By.xpath("//*[@id='pay_saved_payees']")).click();
        System.out.println("pay passed");

        WebElement submitTitle = driver.findElement(By.id("alert_content"));
        if (submitTitle.isDisplayed()){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
