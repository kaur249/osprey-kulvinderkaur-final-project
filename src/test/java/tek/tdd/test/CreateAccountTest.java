package tek.tdd.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;
import tek.tdd.page.CreateAccountPage;
import tek.tdd.utilities.DataGenerator;

public class CreateAccountTest extends BaseUITest {

    String generateRandomEmail;
    private Object emailGenerator;

    @Test
    public void clickOnCreatePrimaryAccountButton() {
        clickOnElement(homepage.createPrimaryAccountButton);
    }

    @Test
    public void validateFormTitleShows() {
        clickOnElement(homepage.createPrimaryAccountButton);
        String expectedTitle = "Create Primary Account Holder";
        String actualTitle = getElementText(createAccountPage.TitleAsCreatePrimaryAccountHolder);
        Assert.assertEquals(actualTitle, expectedTitle,
                "The expected tile should be displayed as Create Primary Account Holder");
    }

    @Test
    public void ClickOnCreateAccountButtonCompleteTheFillUpFormAndSubmitButtonAndValidateAsExpected() {
        generateRandomEmail= DataGenerator.randomEmail();
        clickOnElement(homepage.createPrimaryAccountButton);
        sendText(createAccountPage.EmailAddress,generateRandomEmail);
        // sendText(createAccountPage.EmailAddress, "kaur.k_3653@gmail.com.com");
        selectFromDropDown(createAccountPage.Title, "Ms.");
        sendText(createAccountPage.FirstName, "Kulvinder");
        sendText(createAccountPage.LastName, "Kaur");
        selectFromDropDown(createAccountPage.Gender, "Female");
        selectFromDropDown(createAccountPage.MaritalStatus, "Single");
        sendText(createAccountPage.EmploymentStatus, "Student");
        sendText(createAccountPage.DateOfBirth, "02/09/2000");
        clickOnElement(createAccountPage.CreateAccountSubmitButton);

        boolean isSignUpYourAccountPageDisplayed = isElementDisplayed(CreateAccountPage.SignUpYourAccountPage);
        Assert.assertTrue(isSignUpYourAccountPageDisplayed, "Sign up you account page should be displayed");

        String expectedEmail = generateRandomEmail;
        String actualEmail = getElementText(CreateAccountPage.validateEmailAddressAsExpected);
        Assert.assertEquals(actualEmail, expectedEmail,
                "The expected email should match the actual email");

    }

    @Test
    public void ValidateErrorMessageAsExpected() {
        clickOnElement(homepage.createPrimaryAccountButton);
        sendText(createAccountPage.EmailAddress, "kaur.k_3653@gmail.com");
        selectFromDropDown(createAccountPage.Title, "Ms.");
        sendText(createAccountPage.FirstName, "Kulvinder");
        sendText(createAccountPage.LastName, "Kaur");
        selectFromDropDown(createAccountPage.Gender, "Female");
        selectFromDropDown(createAccountPage.MaritalStatus, "Single");
        sendText(createAccountPage.EmploymentStatus, "Student");
        sendText(createAccountPage.DateOfBirth, "02/09/2000");
        clickOnElement(createAccountPage.CreateAccountSubmitButton);

        String expectedErrorMessage = "Account with email kaur.k_3653@gmail.com is exist";
        String actualErrorMessage = getElementText(createAccountPage.errorMessageAsExpected);
        String deletedErrorText = actualErrorMessage.replace("ERROR","").trim();
        Assert.assertEquals(deletedErrorText,expectedErrorMessage,
                "The expected error message should be same as actual error message");
    }

}