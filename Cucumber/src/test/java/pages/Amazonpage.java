package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Amazonpage {

    public Amazonpage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement result;

    @FindBy(xpath = "//*[@data-image-index='1']")
    public WebElement firstProduct;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement firstProductName;
}
