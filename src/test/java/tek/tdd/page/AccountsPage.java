package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

import java.util.List;
import java.util.Random;

public class AccountsPage extends SeleniumUtilities {

    public AccountsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/a[1]")
    ////*[@id="root"]/div/div[2]/div/div/a[1]
    public WebElement accountButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[1]")
    public WebElement accountRows5;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement accountRows10;

    @FindBy(xpath = "//tr[@class= 'css-0']")
    public List<WebElement> recordPageTen;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement accountRow25;

    @FindBy(xpath = "//tr[@class= 'css-0']")
    public List<WebElement> recordPageTwentyFive;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select")
    public WebElement accountRow50;

    @FindBy(xpath = "//tr[@class= 'css-0']")
    public List<WebElement> recordPageFifty;

    public int countRecordPageTen() {
        return recordPageTen.size();
    }

    public int countRecordPageTwentyFive() {
        return recordPageTwentyFive.size();
    }

    public int countRecordPageFifty() {
        return recordPageFifty.size();
    }
}
