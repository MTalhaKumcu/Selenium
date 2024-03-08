package Day_12_WebTables;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C3_ReadExel {

    @Test
    public void test01() throws IOException {


        String  filePath = System.getProperty("user.dir")+"/src/test/java/Day_13_ExcelAutomation/ulke.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sheet1");//sheet name
        Row row = sheet.getRow(3);
        // parantezler numeric olmali ve index 0`dan baslar
        Cell cell = row.getCell(3);
        // parantezler numeric olmali ve index 0`dan baslar

        System.out.println(cell);

        row = sheet.getRow(3);
        cell = row.getCell(3);

        String expectedData ="cc";
        Assert.assertEquals(expectedData,cell.toString());


    }

}
