package Day_09_NewWindow_ActionClass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C5_ActionsClass extends TestBase {
    @Test
    public void test01() throws InterruptedException{
        driver.get("https://amazon.com");
        Thread.sleep(8000);

        WebElement accountListElement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(accountListElement).perform();

        WebElement createListElement = driver.findElement(By.linkText("Create a List"));
        createListElement.click();

        WebElement yourListElement = driver.findElement(By.xpath("//*[@id='my-lists-tab']"));
        String expectedText ="Your Lists";
        String actualText = yourListElement.getText();
        Assert.assertEquals(expectedText,actualText);
    }

}
