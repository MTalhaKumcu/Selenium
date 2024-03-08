package Day_13_ExcelAutomation;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C1_ExcelAutomation {
    @Test
    public void test01() throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/Day_13_ExcelAutomation/ulke.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis);
        String actualName = workbook
                .getSheet("Sheet1")
                .getRow(5)
                .getCell(4)
                .toString();

        String expectedName = "ee baskent";
        Assert.assertEquals(expectedName, actualName);


        System.out.println("////////////////////////////////////////");

        int lastIndex = workbook
                .getSheet("Sheet1")
                .getLastRowNum();
        System.out.println(lastIndex);


        boolean isKk = false;

        for (int i = 1; i < lastIndex; i++) {
            actualName = workbook
                    .getSheet("Sheet1")
                    .getRow(i)
                    .getCell(0).toString();
            if (actualName.equalsIgnoreCase("aa")) {
                isKk = true;
                break;
            }
        }
        //Assert.assertTrue(isKk);
        System.out.println("---------------------");
        int usedRowCount = workbook
                .getSheet("Sheet2")
                .getPhysicalNumberOfRows();
        int expectedRowCount = 17;

        Assert.assertEquals(expectedRowCount, usedRowCount);

        System.out.println("===============");
        Map<String, String> countryMap = new TreeMap<>();

        Sheet sheet = workbook.getSheet("Sheet1");
        for (int i = 1; i < lastIndex; i++) {
            String key = sheet.getRow(i).getCell(0).toString();

            String value =
                    sheet.getRow(i).getCell(1).toString() + ", " +
                            sheet.getRow(i).getCell(2).toString() + ", " +
                            sheet.getRow(i).getCell(3).toString();
            countryMap.put(key, value);
        }


    }


}
