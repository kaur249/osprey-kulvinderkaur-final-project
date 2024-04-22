package tek.tdd.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.tdd.utilities.SeleniumUtilities;

public class CreateAccountPage extends SeleniumUtilities {

    public CreateAccountPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/h2")
    public WebElement TitleAsCreatePrimaryAccountHolder;

    @FindBy(name = "email")
    public WebElement EmailAddress;

    @FindBy(id = "title")
    public WebElement Title;

    @FindBy(name = "firstName")
    public WebElement FirstName;


    @FindBy(name = "lastName")
    public  WebElement LastName;
    @FindBy(id = "gender")
    public WebElement Gender;
    @FindBy(id = "maritalStatus")
    public WebElement MaritalStatus;

    @FindBy(name = "employmentStatus")
    public WebElement EmploymentStatus;
    @FindBy(name = "dateOfBirth")
    public WebElement DateOfBirth;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]")
    public WebElement CreateAccountSubmitButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/h2[1]")
    public static WebElement SignUpYourAccountPage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/h2[3]")
    public static WebElement validateEmailAddressAsExpected;

    @FindBy(xpath =  "//div[@class='chakra-alert banner-error css-1ykemat']")
    public WebElement errorMessageAsExpected;








}
