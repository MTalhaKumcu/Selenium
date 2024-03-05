package Day_09_NewWindow_ActionClass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C4_ActionsClass extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']")).click();

        WebElement dragMe = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropMe = driver.findElement(By.xpath("(//*[@id='droppable'])[1]"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe, dropMe).perform();
        Thread.sleep(5000);
        WebElement droppedElement = driver.findElement(By.xpath("//*[text()='Dropped!']"));
        String expectedDrop = "Dropped!";
        String actualDropText = droppedElement.getText();
        Assert.assertEquals(expectedDrop, actualDropText);


    }
}
