package Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdirver.chrome.drive", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        WebElement deleteButtonElement = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButtonElement.isDisplayed()) {
            System.out.println("Delete button Test Passed");
        } else {
            System.out.println("Delete button Test Failed");
        }
        deleteButtonElement.click();

        WebElement addElementElement = driver.findElement(By.xpath("//h3"));

        if (addElementElement.isDisplayed()) {
            System.out.println("addElement text Test Passed");
        } else {
            System.out.println("addElement text Test Failed");
        }

        Thread.sleep(3000);
        driver.close();


    }
}
