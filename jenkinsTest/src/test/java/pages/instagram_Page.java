package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class instagram_Page {

    public instagram_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Allow all cookies']")
    public WebElement allowCookies;

    @FindBy(xpath = "//*[text()='Sign up'")
    public WebElement singUp;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement userEmail;

    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement userFullName;

    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement userAllias;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement userPassword;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement account_info_next_button;

    @FindBy(xpath = "//*[@title='Month:']")
    public WebElement birthday_Month;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement birthday_info_next_button;





}
