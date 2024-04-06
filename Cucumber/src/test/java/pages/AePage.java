package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AePage {

    public AePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement firstSignUpButton;
    @FindBy(xpath = "//*[@type='text']")
    public WebElement userName;

    @FindBy(xpath = "(//*[@type='email'])[2]")
    public WebElement eMail;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement singUpInCreate;

    @FindBy(xpath = "//*[@value='Mr']")
    public WebElement gender;

    @FindBy(xpath = "//*[@type='checkbox']")
    public WebElement checkbox1;
    @FindBy(xpath = "//*[text()='Receive special offers from our partners!']")
    public WebElement checkbox2;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement account_Created;
    @FindBy(xpath = "//*[text()='Consent']")
    public WebElement consent;
    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createButton;
}
