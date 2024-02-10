package Day_01_MakeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriver {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver", "src/resource/chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println(
                driver.getTitle()+"\n"
                +driver.getCurrentUrl()
                );
        System.out.println(driver.getWindowHandle());
        // acilan pencerenin unique hash deverini verir
        System.out.println(driver.getWindowHandles());
        //ayni islemin birden fazla pencere degerlerinin dondurur
        System.out.println(driver.getPageSource());
        //acilan sitenin kaynak kodlarini getirir.



        Thread.sleep(1000);
        driver.close();
    }
}
