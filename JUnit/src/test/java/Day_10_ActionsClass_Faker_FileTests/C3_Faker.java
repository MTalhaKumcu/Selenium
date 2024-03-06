package Day_10_ActionsClass_Faker_FileTests;

import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C3_Faker extends TestBase {

    @Test
    public void test01() throws InterruptedException{
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("(//*[@value='1'])[3]")).click();
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();

        Actions actions = new Actions(driver);
        WebElement nameElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        actions.click(nameElement)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).sendKeys(Keys.TAB)
                .sendKeys("15").sendKeys(Keys.TAB)
                .sendKeys("Mar").sendKeys(Keys.TAB)
                .sendKeys("1970").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Thread.sleep(15000);
    }
}

