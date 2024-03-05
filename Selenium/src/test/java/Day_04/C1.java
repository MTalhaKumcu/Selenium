package Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class C1 {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.driver.chrome","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://amazon.com");

        WebElement searchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));

        searchBoxElement.sendKeys("city bike" + Keys.ENTER);
        WebElement navbarResultBike = driver.findElement(By.className("sg-col-inner"));
        System.out.println(navbarResultBike.getText());

        List<WebElement> productimageLists = driver.findElements(By.className("s-image"));
        productimageLists.get(0).click();



        Thread.sleep(3000);
        driver.close();
    }
}
