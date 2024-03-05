package Day_06_Junit;

import org.junit.Assert;
import org.junit.Test;

public class C4_AssertionMethods {

    @Test
    public void test01() {
        int s1 = 20;
        int s2 = 10;
        int s3 = 30;
        //s1 s2den buyuk oldugunu test edin
        Assert.assertTrue(s1 > s2);
        //s1 s3`ten buyuk olmadigini test edin
        Assert.assertFalse(s1>s3);

    }
}
