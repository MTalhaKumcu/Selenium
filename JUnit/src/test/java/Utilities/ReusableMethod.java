package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class ReusableMethod {

    public static void wholePageSS(WebDriver driver) throws IOException {
        TakesScreenshot tss = (TakesScreenshot) driver;

        LocalDateTime ltd = LocalDateTime.now();
        String dateEthicet = "AllPage"
                + ltd.getYear()
                + ltd.getMonth()
                + ltd.getDayOfMonth()
                + ltd.getHour()
                + ltd.getMinute()
                + ltd.getSecond()
                +".png";
        String ssFilePath = "target/ScreenShot/"+dateEthicet;
        File wholePageSS = new File(ssFilePath);
        File temporarySS = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temporarySS,wholePageSS);
    }
}
