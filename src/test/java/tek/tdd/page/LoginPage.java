package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class LoginPage extends SeleniumUtilities {
    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/h2]")
    public WebElement loginBtn;
    @FindBy(name = "username")
    public WebElement userName;
    @FindBy(name = "password")
    public WebElement userPassword;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]")
    public WebElement signInBtn;
    @FindBy(xpath = "//h2[@class='chakra-heading css-1at26de']")
    public WebElement customerServicePortalPage;
}
