package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class UserProfilePage extends SeleniumUtilities {

    public UserProfilePage() {
        PageFactory.initElements(getDriver(),this);}

    @FindBy (xpath = "/html/body/div[1]/div/div[1]/div/button/svg/path[1]")
    public WebElement ProfileButton;



    }


