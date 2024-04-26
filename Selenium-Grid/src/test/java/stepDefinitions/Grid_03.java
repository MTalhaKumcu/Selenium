package stepDefinitions;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static manage.DriverManage.*;

public class Grid_03 {


    @BeforeTest
    @Parameters("browser")
    void beforeTest(@Optional ("chrome") String browser){
        setDriver(browser);
    }


    @Test
    public void Test01(){
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());

    }

    @AfterTest
    void afterTest01(){
        closeDriver();
    }

}

