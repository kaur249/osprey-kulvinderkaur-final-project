package tek.tdd.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;

public class UserProfileTest extends BaseUITest {
    @Test
    public void validateProfileButtonIsEnabled() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);

        WebElement profileButton= userProfilePage.ProfileBtn;
        clickOnElement(profileButton);
        boolean isProfileButtonEnabled = isElementEnabled(userProfilePage.ProfileBtn);
        Assert.assertTrue(isProfileButtonEnabled, "Profile Button should be enabled on the right");

        boolean isStatusEnabled= isElementEnabled(userProfilePage.Status);
        Assert.assertTrue(isStatusEnabled,"Active should be enabled all time");


    }
}