package Day_09_NewWindow_ActionClass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C1_NewWindow extends TestBase {

    @Test
    public void  test01() throws InterruptedException {

        driver.get("https://amazon.com");
        String amazonWindowHandleValue = driver.getWindowHandle();
        Thread.sleep(5000);
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


        driver.switchTo().newWindow(WindowType.TAB);


        driver.get("https://google.com");
        String googleWHV = driver.getWindowHandle();
        expectedTitle = "Google";
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedTitle));


        //tekrar amazon`a gec ve url`in amazon icerigi varmi test et

        driver.switchTo().window(amazonWindowHandleValue);
        expectedTitle = "Amazon";
        actualURL =driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedTitle));

    }

}
