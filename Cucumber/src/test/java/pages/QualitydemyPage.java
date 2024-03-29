package pages;

import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
