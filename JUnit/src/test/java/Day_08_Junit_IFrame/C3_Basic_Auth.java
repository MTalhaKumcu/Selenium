package Day_08_Junit_IFrame;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C3_Basic_Auth extends TestBase {

    @Test
    public void basic_auth() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement successText = driver.findElement(By.tagName("p"));
        Assert.assertTrue(successText.isDisplayed());
    }

}
