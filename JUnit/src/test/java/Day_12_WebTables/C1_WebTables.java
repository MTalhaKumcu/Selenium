package Day_12_WebTables;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class C1_WebTables extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://amazon.com");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        Thread.sleep(5000);

        WebElement allBodyElement = driver.findElement(By.tagName("tbody"));
        System.out.println(allBodyElement.getText());

        List<WebElement> lineElement = driver.findElements(By.xpath("//tbody/tr"));

        int expectedLineSize = 7;
        int actualLineSize = lineElement.size();
        Assert.assertEquals(expectedLineSize, actualLineSize);

        System.out.println("-------");

        for (WebElement eachLine : lineElement) {
            System.out.println(eachLine.getText());
            System.out.println("-----------");
        }

        List<WebElement> firstLineElementList = driver.findElements(By.xpath("//tbody/tr[1]/td"));
        int expectedColumn = 13;
        int actualCloumn = firstLineElementList.size();
        Assert.assertEquals(expectedColumn,actualCloumn);

        System.out.println("=========================");
        List<WebElement> fifthRowElement = driver.findElements(By.xpath("//tbody/tr/td[5]"));
        for (WebElement eachRow:fifthRowElement){
            System.out.println(eachRow.getText());
            System.out.println("+++++++++++++++");
        }

        System.out.println("???????????????????????");
        System.out.println(dataGet(3,5));
    }

    private String dataGet(int row, int column) {
        String dynamicXpath = "//tbody/tr["+row+"]/td["+column+"]";
        WebElement requiredDataElement = driver.findElement(By.xpath(dynamicXpath));

        return requiredDataElement.getText();
    }
}
