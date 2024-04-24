package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class AccountsPage extends SeleniumUtilities {

    public AccountsPage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/a[1]")
    public WebElement accountButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement accountRows;

}