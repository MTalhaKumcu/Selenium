package Day_13_ExcelAutomation;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C2_WriteExcel {

    @Test
    public void test01() throws IOException {

        String filePath = System.getProperty("user.dir") + "/src/test/java/Day_13_ExcelAutomation/ulke.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sheet1");

        sheet.getRow(0).createCell(5).setCellValue("Nufus");

        sheet.getRow(1).createCell(5).setCellValue("150000");
        sheet.getRow(9).createCell(5).setCellValue("2500");
        sheet.getRow(5).createCell(5).setCellValue("54000");

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

        fis.close();
        fos.close();
        workbook.close();
    }

}
