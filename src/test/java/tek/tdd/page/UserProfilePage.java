package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class UserProfilePage extends SeleniumUtilities {

    public UserProfilePage() {
        PageFactory.initElements(getDriver(),this);}

    @FindBy (xpath = "/html/body/div[1]/div/div[1]/div/button")
    public WebElement ProfileBtn;

    @FindBy(xpath = "//*[@id=\"chakra-modal--body-:r4e:\"]/div/div/div[1]/p[2]/span/span")
    public WebElement Status;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[1]")
    public WebElement UserType;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[1]")
    public WebElement FullName;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[1]")
    public WebElement USERNAME;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/p")
    public WebElement Authorities;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/footer/div/button[1]")
    public WebElement LogoutBtn;
//


    }


