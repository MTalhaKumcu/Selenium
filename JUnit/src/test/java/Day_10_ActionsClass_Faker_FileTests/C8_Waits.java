package Day_10_ActionsClass_Faker_FileTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C8_Waits {
    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement itsgone = driver.findElement(By.xpath("//p[text()=\"It`s gone!\"]"));
        Assert.assertTrue(itsgone.isDisplayed());

       /* driver.get("Https://amazon.com");
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("nutella"+ Keys.ENTER);

        WebElement resultText = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedText = "nutella";
        String actualText = resultText.getText();
        Assert.assertTrue(actualText.contains(expectedText));
        */


    }
}
