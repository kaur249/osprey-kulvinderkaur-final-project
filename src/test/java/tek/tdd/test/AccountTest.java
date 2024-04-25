package tek.tdd.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;

import java.util.List;

public class AccountTest extends BaseUITest {
    @Test
    public void NavigateToCustomerServicePortalNavigateVerify5row() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(loginPage.customerServicePortalPage);
        clickOnElement(accountsPage.accountButton);

        String expectedRow = "Show 5";
        String actualRow = getElementText(accountsPage.accountRows5);
        Assert.assertEquals(actualRow, expectedRow, "The expected row should be same as actual row");
    }

    @Test
    public void NavigateToCustomerServicePortalNavigateToAccountPerPageToTenValidateTableRecord() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(accountsPage.accountButton);
        selectFromDropDown(accountsPage.accountRows10, "Show 10");
        int recordCount = accountsPage.countRecordPageTen();
        recordCount--;
        int actualRecord=recordCount;
        int expectedRecord = 10;
        Assert.assertEquals(actualRecord, expectedRecord);
    }

    @Test
    public void NavigateToCustomerServicePortalNavigateToAccountPerPageToTwentyFiveValidateTableRecord() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(accountsPage.accountButton);
        selectFromDropDown(accountsPage.accountRow25, "Show 25");
        int recordCountOne = accountsPage.countRecordPageTwentyFive();
        recordCountOne--;
        int actualRecordOne = recordCountOne;
        int expectedRecordOne = 25;
        Assert.assertEquals(actualRecordOne,expectedRecordOne);
    }

    @Test
    public void NavigateToCustomerServicePortalNavigateToAccountPerPageToFiftyValidateTableRecord() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(accountsPage.accountButton);
        selectFromDropDown(accountsPage.accountRow50, "Show 50");
        int recordCountTwo = accountsPage.countRecordPageFifty();
        recordCountTwo;
        int actualRecordTwo = recordCountTwo;
        int expectedRecordTwo = 50;
        Assert.assertEquals(actualRecordTwo, expectedRecordTwo);
    }
}