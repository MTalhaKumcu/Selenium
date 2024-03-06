package Day_10_ActionsClass_Faker_FileTests;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C2_KeyboarActions extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("(//*[@value='1'])[3]")).click();
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();

        Actions actions = new Actions(driver);
        WebElement nameElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        actions.click(nameElement)
                .keyDown(Keys.SHIFT).sendKeys("F")
                .keyUp(Keys.SHIFT).sendKeys("irstname")
                .keyDown(Keys.SHIFT).sendKeys("L")
                .keyUp(Keys.SHIFT).sendKeys("astname")
                .sendKeys(Keys.TAB).sendKeys("example@gmail.com")
                .sendKeys(Keys.TAB).sendKeys("123123123asda@gmail.com")
                .sendKeys(Keys.TAB).sendKeys("AbcDef123")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("15")
                .sendKeys(Keys.TAB).sendKeys("Mar")
                .sendKeys(Keys.TAB).sendKeys("1990")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(2000);

    }
}
