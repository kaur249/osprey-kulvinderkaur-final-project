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

        String actualErrorMessage = getElementText(loginPage.UserWrongNotFound);
        String expectedErrorMessage = "ERROR\n" +
                "User wrong not found";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "The expected username error message should match the actual error message");

        /*@Test
        public void testWrongPasswordErrorMessage() {
            clickOnElement(loginPage.loginBtn);
            sendText(loginPage.userName, "supervisor");
            sendText(loginPage.userPassword, "wrong_supervisor");
            clickOnElement(loginPage.signInBtn);
            String actualErrorMessage = getElementText(loginPage.PasswordNotMatched);
            String expectedErrorMessage = "ERROR\nPassword not matched";
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "The expected password error message should match the actual error message");

         */
        }
        }
