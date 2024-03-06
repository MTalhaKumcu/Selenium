package Day_10_ActionsClass_Faker_FileTests;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C7_FileUploadTest extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFileElement = driver.findElement(By.xpath("//*[@id='file-upload']"));

        String differentEveryone = System.getProperty("user.dir");
        String similarEveryone = "/src/test/java/Day_10_ActionsClass_Faker_FileTests/example.txt";
        String filePath = differentEveryone + similarEveryone;
        chooseFileElement.sendKeys(filePath);
        driver.findElement(By.xpath("//*[@class='button']")).click();

        WebElement uploadText = driver.findElement(By.tagName("h3"));
        String expectedText = "File Uploaded!";
        String actualText = uploadText.getText();

        Assert.assertEquals(expectedText,actualText);

        Thread.sleep(5000);


    }
}
