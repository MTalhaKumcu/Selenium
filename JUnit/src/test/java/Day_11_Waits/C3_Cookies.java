package Day_11_Waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C3_Cookies extends TestBase {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
        Set<Cookie> cookieSet = driver.manage().getCookies();
        int lineNo = 1;
        for (Cookie eachCookie : cookieSet) {
            System.out.println(lineNo + "--->" + eachCookie);
            lineNo++;
        }

        int expectedMinCookieNumber = 1;
        int actualCookieNumber = cookieSet.size();
        Assert.assertEquals(expectedMinCookieNumber, actualCookieNumber);
     /*
        String actualCookieValue = driver.manage().getCookieNamed("csm-sid").getValue();
        String expectedCookieValue = "";
        Assert.assertEquals(expectedCookieValue, actualCookieValue);
     */ // var olan cookie`leri gosterir

        Cookie bestCookie = new Cookie("best cookie", "chocolate");
        driver.manage().addCookie(bestCookie);

        lineNo = 1;
        cookieSet = driver.manage().getCookies();
        String bestCookieValue = "";

        for (Cookie eachCookie : cookieSet) {
            if (eachCookie.getName().equals("best cookie")) {
                bestCookieValue = eachCookie.getValue();
            }
            System.out.println(lineNo + "--->" + eachCookie);
            lineNo++;
        }

        String expectedCookieValue = "chocolate";
        Assert.assertEquals(expectedCookieValue, bestCookieValue);


        driver.manage().deleteCookieNamed("csm-sid");

        lineNo = 1;
        cookieSet = driver.manage().getCookies();

        String flag = "There is no such cookie called csm-sid";

        for (Cookie eachCookie : cookieSet) {
            System.out.println(lineNo + "--->" + eachCookie);
            if (eachCookie.getName().equals("csm-sid")) {
                flag = "There is a cookie which is name cms-sid";
            }
            lineNo++;
        }
        Assert.assertTrue(flag.equals("There is no such cookie called csm-sid"));



        driver.manage().deleteAllCookies();

        cookieSet =driver.manage().getCookies();
        Assert.assertEquals(cookieSet.size(),0);
    }



}
