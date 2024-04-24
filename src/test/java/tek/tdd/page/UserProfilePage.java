package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class UserProfilePage extends SeleniumUtilities {

    public UserProfilePage() {
        PageFactory.initElements(getDriver(),this);}

    @FindBy (xpath = "//button[@class='chakra-button chakra-button css-1lzp9bh']")
    public WebElement ProfileBtn;
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/header")
    public WebElement profileHeader;
    @FindBy(xpath = "//span[@class='css-1ny2kle']")
    public WebElement Status;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[2]")
    public WebElement UserType;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[2]")
    public WebElement FullName;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[2]")
    public WebElement USERNAME;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/ul/li")
    public WebElement Authorities;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/footer/div/button[1]")
    public WebElement LogoutBtn;

    }


