package tests.Day_16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C3_SoftAssertion {
    @Test
    public void hardAssertion() {
        int number = 51;

        Assert.assertTrue(number % 2 == 0);
        Assert.assertTrue(number > 100);
        Assert.assertTrue(number < 100);
        Assert.assertTrue(number % 3 == 0);


    }

    @Test
    public void softAssertion() {
        int number = 51;

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(number % 2 == 0,"1.");
        softAssert.assertTrue(number > 100,"2.");
        softAssert.assertTrue(number < 100);
        softAssert.assertTrue(number % 3 == 0);

        softAssert.assertAll();


    }
}
