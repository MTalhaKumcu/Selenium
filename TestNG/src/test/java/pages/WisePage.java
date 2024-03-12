package pages;

import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WisePage {
    public WisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
