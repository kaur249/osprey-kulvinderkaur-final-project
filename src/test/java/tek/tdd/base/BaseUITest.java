package tek.tdd.base;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import tek.tdd.page.*;
import tek.tdd.utilities.SeleniumUtilities;

@Listeners({ExtentITestListenerAdapter.class})
public class BaseUITest extends SeleniumUtilities {

    public HomePage homepage;
    public CreateAccountPage createAccountPage;
    public LoginPage loginPage;
    public UserProfilePage userProfilePage;
    public PlansPage plansPage;
    public AccountsPage accountsPage;


    @BeforeMethod
    public void initiateTestMethod(){
        super.openBrowser();
        homepage= new HomePage();
        createAccountPage= new CreateAccountPage();
        loginPage= new LoginPage();
        userProfilePage= new UserProfilePage();
        plansPage= new PlansPage();
        accountsPage= new AccountsPage();
    }

    @AfterMethod
    public void endTestMethod(ITestResult result) throws InterruptedException{
        Thread.sleep(5000);
        if(result.getStatus() == ITestResult.FAILURE){
            TakesScreenshot takesScreenshot= (TakesScreenshot) getDriver();
            String screenshot= takesScreenshot.getScreenshotAs(OutputType.BASE64);
            ExtentTestManager.getTest()
                    .fail("Test Failed Taking Screen Shot",
                            MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot)
                                    .build());
        }
        super.quitBrowser();
    }

}


