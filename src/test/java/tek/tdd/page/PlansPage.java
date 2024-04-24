package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class PlansPage extends SeleniumUtilities {

    public PlansPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/a[2]")
    public WebElement plansButton;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[2]")
    public WebElement motorcyclePlanType;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[2]")
    public WebElement boatPlanType;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[2]")
    public WebElement rentersPlanType;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[2]")
    public WebElement autoPlanType;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]")
    public WebElement dateCreated;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]")
    public WebElement dateExpired;
}
