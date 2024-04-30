package tek.tdd.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;

public class LoginTest extends BaseUITest {
    @Test
    public void LoginAndValidateCustomerServicePortal() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);

        boolean isCustomerServicePortalTitleDisplayedAfterLogin = isElementDisplayed(loginPage.customerServicePortalPage);
        Assert.assertTrue(isCustomerServicePortalTitleDisplayedAfterLogin,
                "Customer Service Portal should be displayed");

    }

    @Test
    public void testWrongUsernameErrorMessage() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "wrong");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);

        String expectedErrorMessage= "User wrong not found";
        String actualErrorMessage = getElementText(loginPage.UserWrongNotFound);
        String deletedErrorText= actualErrorMessage.replace("ERROR","").trim();
        Assert.assertEquals(deletedErrorText,expectedErrorMessage,"User wrong not found");
    }

        @Test
        public void testWrongPasswordErrorMessage() {
            clickOnElement(loginPage.loginBtn);
            sendText(loginPage.userName, "supervisor");
            sendText(loginPage.userPassword, "wrong_supervisor");
            clickOnElement(loginPage.signInBtn);

            //Password not matched
            String expectedErrorMessage= "Password not matched";
            String actualErrorMessage = getElementText(loginPage.PasswordNotMatched);
            String deletedErrorText= actualErrorMessage.replace("ERROR","").trim();
            Assert.assertEquals(deletedErrorText,expectedErrorMessage,"Password not matched");
        }
        }
