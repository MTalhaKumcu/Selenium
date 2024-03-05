package Day_02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //web page acilincaya veya aradigimiz elementler buluncaya kadar
        //driver`in bekleyecegi max bekleme suresi

        driver.get("https://google.com");

        System.out.println("first location " + driver.manage().window().getPosition());
        System.out.println("first size of window" + driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().maximize();
        System.out.println("max location " + driver.manage().window().getPosition());
        System.out.println("max size " + driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        System.out.println("after full screen location " + driver.manage().window().getPosition());
        System.out.println("after full screen size " + driver.manage().window().getSize());


        Thread.sleep(2000);
        driver.manage().window().minimize();
        System.out.println("after minimize location " + driver.manage().window().getPosition());
        System.out.println("after minimize size " + driver.manage().window().getSize());


        Thread.sleep(2000);
        //window`u istedigimiz boyuta getirme

        driver.manage().window().setPosition(new Point(100,200));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println("after setPosition location " + driver.manage().window().getPosition());
        System.out.println("after setSize size " + driver.manage().window().getSize());

        Thread.sleep(5000);
        driver.close();
    }
}
