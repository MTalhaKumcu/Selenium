package Day_08_Junit_IFrame;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C4_Iframe extends TestBase {
    @Test
    public void test01() {

        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement h3 = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(h3.isDisplayed());
        System.out.println(h3.getText());

        WebElement frameElement =driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameElement);
        WebElement textBoxElement = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBoxElement.clear();
        textBoxElement.sendKeys("Hello ! World" + Keys.ENTER);

        driver.switchTo().parentFrame();
        WebElement footerElement = driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(footerElement.isDisplayed());
        System.out.println(footerElement.getText());
    }
}
