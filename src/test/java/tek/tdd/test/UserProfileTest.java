package tek.tdd.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;

public class UserProfileTest extends BaseUITest {
    @Test
    public void ValidCSRCredentialAndNavigateToCustomerServicePortalAndValidatePSDCorrect() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.ProfileBtn);

        boolean isProfileHeaderDisplayed= isElementDisplayed(userProfilePage.profileHeader);
        Assert.assertTrue(isProfileHeaderDisplayed);

        String expectedStatus = "Active";
        String actualStatus = getElementText(userProfilePage.Status);
        Assert.assertEquals(actualStatus, expectedStatus, "Active should be displayed");

        String expectedUserType = "CSR";
        String actualUserType = getElementText(userProfilePage.UserType);
        Assert.assertEquals(actualUserType, expectedUserType, "CSR should be displayed");

        String expectedFullName = "Supervisor";
        String actualFullName = getElementText(userProfilePage.FullName);
        Assert.assertEquals(actualUserType, expectedUserType, "Supervisor should be displayed");

        String expectedUserName = "supervisor";
        String actualUserName = getElementText(userProfilePage.USERNAME);
        Assert.assertEquals(actualUserName, expectedUserName, "supervisor should be displayed");

        String expectedAuthorities = "admin";
        String actualAuthorities = getElementText(userProfilePage.Authorities);
        Assert.assertEquals(actualAuthorities, expectedAuthorities, "Authorities should be displayed");
    }

    @Test
    public void ClickOnProfileAndLogout() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.ProfileBtn);
        clickOnElement(userProfilePage.LogoutBtn);
    }
    @Test
    public void testLogoutAndNavigateToHomePage() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(userProfilePage.ProfileBtn);
        clickOnElement(userProfilePage.LogoutBtn);

        boolean isNavigateToHomePageAfterLogout= isElementDisplayed(homepage.LetsGetYouStartedButton);
        Assert.assertTrue(isNavigateToHomePageAfterLogout,"User navigate to home page after Logout button");

    }
    }




