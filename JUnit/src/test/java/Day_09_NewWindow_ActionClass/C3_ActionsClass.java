package Day_09_NewWindow_ActionClass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Set;

public class C3_ActionsClass extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/context_menu");
        String firstWHV = driver.getWindowHandle();

        WebElement areaElement = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(areaElement).perform();

        String expectedAlert = "You selected a context menu";
        String actualAlert = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlert, actualAlert);

        driver.switchTo().alert().accept();

        driver.findElement(By.linkText("Elemental Selenium")).click();
        Set<String> WHVsets = driver.getWindowHandles();
        String secondWHV = "";
        for (String eachWHV : WHVsets) {
            if (!eachWHV.equals(firstWHV)) {
                secondWHV = eachWHV;
            }
        }
        driver.switchTo().window(secondWHV);

        WebElement h1Element = driver.findElement(By.tagName("h1"));
        String expectedH1Text = "Elemental Selenium";
        String actualh1Text = h1Element.getText();
        Assert.assertEquals(expectedH1Text,actualh1Text);


    }
}
