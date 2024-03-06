package Day_10_ActionsClass_Faker_FileTests;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C4_FileExistTest {

    @Test
    public void test01(){

        String filePath = "src/test/java/Day_10_ActionsClass_Faker_FileTests/example.txt";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));
    }
}
