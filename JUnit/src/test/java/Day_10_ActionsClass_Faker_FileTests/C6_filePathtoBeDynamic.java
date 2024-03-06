package Day_10_ActionsClass_Faker_FileTests;

import org.junit.Test;

public class C6_filePathtoBeDynamic {

    @Test
    public void teset01(){

        System.out.println(System.getProperty("user.dir"));
        //calisilan dosya directory
        System.out.println(System.getProperty("user.home"));
        //home directory
    }
}
