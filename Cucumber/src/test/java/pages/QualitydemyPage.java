package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement firstLoginButton;

    @FindBy(xpath="//input[@type='email']")
    public WebElement eMail;

    @FindBy(xpath="//input[@type='password']")
    public WebElement passwordBox;


    @FindBy (xpath = "(//*[@type='submit'])[2]")
    public WebElement loginButton;

}
