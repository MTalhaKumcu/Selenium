package manage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class driverManage {


    public static WebDriver driver;

    DesiredCapabilities capabilities = new DesiredCapabilities();


    public WebDriver setUpChromeDriver() throws MalformedURLException {
        capabilities.setPlatform(Platform.ANY);
        capabilities.setBrowserName("Chrome");
        capabilities.setVersion("124.0.6367.79");


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(capabilities);

        driver = new RemoteWebDriver(new URL("http://192.168.0.115:4444"),new ChromeOptions());

        return driver;
    }

}
