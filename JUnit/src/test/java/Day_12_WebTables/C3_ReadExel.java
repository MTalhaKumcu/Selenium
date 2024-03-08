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


        String  filePath = System.getProperty("user.dir")+"/exel path";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sheet Name");//sheet name
        Row row = sheet.getRow("row number");
        // parantezler numeric olmali ve index 0`dan baslar
        Cell cell = row.getCell("cell number" );
        // parantezler numeric olmali ve index 0`dan baslar

        System.out.println(cell);

        row = sheet.getRow(3);
        cell = row.getCell(5);

        String expectedData ="Luanda";
        Assert.assertEquals(expectedData,cell.toString());


    }

}
