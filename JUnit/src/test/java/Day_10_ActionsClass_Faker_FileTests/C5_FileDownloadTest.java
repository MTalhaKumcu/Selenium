package Day_10_ActionsClass_Faker_FileTests;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C5_FileDownloadTest extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//*[text()='logo.png']")).click();
        Thread.sleep(5000);
        String staiedFilePath = System.getProperty("user.home");
        String variableFilePath = "\\Downloads\\logo.png";
        String filePath = staiedFilePath + variableFilePath;
        Assert.assertTrue(Files.exists(Paths.get(filePath)));

        //in working directory
        staiedFilePath = "/src/test/java/Day_10_ActionsClass_Faker_FileTests/example.txt";
        variableFilePath = System.getProperty("user.dir");

        filePath = staiedFilePath + variableFilePath;

        Assert.assertTrue(Files.exists(Paths.get(filePath)));

    }
}
