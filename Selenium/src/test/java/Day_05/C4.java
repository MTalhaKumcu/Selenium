package Day_05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://google.com");
        driver.findElement(By.xpath("//button[@id='W0wltc']")).click();
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Google")) {
            System.out.println("Title contain google");
        } else {
            System.out.println("title doesnt has contain google");
        }
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        searchBox.sendKeys("nutella" + Keys.ENTER);
        System.out.println("nutella has written");

        WebElement searchResult = driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("Search Result is: " + searchResult.getText());
        String resultTitle = searchResult.getText();
        String[] spliTitle = resultTitle.split(" ");
        String stringValueOfTitle = spliTitle[1];
        stringValueOfTitle = stringValueOfTitle.replaceAll("\\D", "");
        int intValueOfTitle =Integer.parseInt(stringValueOfTitle);
        if (intValueOfTitle > 100000000){
            System.out.println("result is less than 10 billion");
        }else{
            System.out.println("result is more than 10 billion");
        }


        Thread.sleep(3000);
        driver.close();
    }
}
