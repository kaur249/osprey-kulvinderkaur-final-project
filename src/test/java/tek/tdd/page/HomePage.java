package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class HomePage extends SeleniumUtilities {

    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath= "//*[@id=\"root\"]/div/div[1]/div/h2")
    public WebElement TekInsuranceInfo;

    // Create Primary Account Button
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/a")
    public WebElement CreatePrimaryAccount;

    // Let's get you started Account element
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/h2[1]")
    public WebElement LetsGetYouStartedButton;






}
