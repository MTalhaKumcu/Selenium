package Day_12_WebTables;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C2_WebTables extends TestBase {
    @Test
    public void test01() {
        //(//div[@role='row'])[3]/div[@role='gridcell'][2]
        driver.get("https://demoqa.com/webtables");
        List<WebElement> headers = driver.findElements(By.xpath("//div[@role='columnheader']"));
        for (WebElement eachHeader : headers) {
            System.out.println(eachHeader.getText());
        }
        System.out.println("3. header title :" + headers.get(3).getText());
        List<WebElement> tableDatas = driver.findElements(By.xpath("//div[@role='gridcell']"));

        int notNullData = 0;
        for (WebElement eachData : tableDatas) {
            if (!eachData.getText().isBlank()) {
                System.out.println(eachData.getText());
                notNullData++;
            }
        }
        System.out.println("not null cell count: " + notNullData);


        List<WebElement> rowsList = driver.findElements(By.xpath("//div[@role='rowgroup']"));
        System.out.println("row counts: " + rowsList.size());

        System.out.println("Column counts: " + headers.size());

        List<WebElement> thirdRowElements = driver.findElements(By.xpath("(//div[@role='row'])//div[3]"));

        for (WebElement eachRowData : thirdRowElements) {
            if (!eachRowData.getText().isBlank()) {
                System.out.println(eachRowData.getText());

            }
        }

        for (int i=2;i<rowsList.size();i++){
            WebElement name = driver.findElement(By.xpath(getDynamicXpath(i,1)));
            if (name.getText().equalsIgnoreCase("Kierra")){
                WebElement salary = driver.findElement(By.xpath(getDynamicXpath(i,5)));
                System.out.println("kierra`s salary:" +salary.getText());
            }
        }
        getDataWrite(4,3);
    }


    private void getDataWrite(int rowNo, int cloumnNo){
        String dynamicXpath ="(//div[@role='row'])[" + rowNo + "]//div[" + cloumnNo + "]";
        WebElement wantedElement = driver.findElement(By.xpath(dynamicXpath));
        System.out.println("required data of cell: "+wantedElement.getText());
    }



    public String getDynamicXpath(int rowNo, int cloumnNo) {
        return "(//div[@role='row'])[" + rowNo + "]//div[" + cloumnNo + "]";
    }


}
