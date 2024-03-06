package Day_10_ActionsClass_Faker_FileTests;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C1_keyboardBase_keyboardActions extends TestBase {


    @Test
    public void test01() throws InterruptedException {

        driver.get("https://amazon.com");

        Actions actions = new Actions(driver);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        actions.click(searchBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("amsung")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71")
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(3000);
        WebElement resultText = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedTextContent = "samsung a71";
        String actualTextContent = resultText.getText();

        Assert.assertTrue(actualTextContent.contains(expectedTextContent));
    }
}
