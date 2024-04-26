package stepDefinitions;

import com.google.j2objc.annotations.Weak;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import manage.DriverManage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.sql.DriverAction;
import java.sql.DriverManager;

public class Grid_02 {

    static DriverManage driverManager = new DriverManage();
    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        driver = driverManager.setUpChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());
        driver.close();

    }


}
