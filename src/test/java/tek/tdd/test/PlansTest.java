package tek.tdd.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;

public class PlansTest extends BaseUITest {
    @Test
    public void NavigateToCustomerServicePortalAndThenNavigateToPlanPage() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(plansPage.plansButton);
    }

    @Test
    public void Validate4RowOfDataIsPresent() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(plansPage.plansButton);

        boolean isMotorcyclePresent = isElementDisplayed(plansPage.motorcyclePlanType);
        Assert.assertTrue(isMotorcyclePresent);

        boolean isBoatPresent = isElementDisplayed(plansPage.boatPlanType);
        Assert.assertTrue(isBoatPresent);

        boolean isRentersPresent = isElementDisplayed(plansPage.rentersPlanType);
        Assert.assertTrue(isRentersPresent);

        boolean isAutoPresent = isElementDisplayed(plansPage.autoPlanType);
        Assert.assertTrue(isAutoPresent);
    }

    @Test
    public void ValidateCreateDateIsTodayDateAndDateExpireIsDayAfter() {
        clickOnElement(loginPage.loginBtn);
        sendText(loginPage.userName, "supervisor");
        sendText(loginPage.userPassword, "tek_supervisor");
        clickOnElement(loginPage.signInBtn);
        clickOnElement(plansPage.plansButton);

        String actualDateCreated = getElementText(plansPage.dateCreated);
        String expectedDateCreated = "April 23, 2024";
        Assert.assertEquals(actualDateCreated, expectedDateCreated, "Date created should match Today's Date");

        String actualDateExpired = getElementText(plansPage.dateExpired);
        String expectedDateExpired = "April 24, 2024";
        Assert.assertEquals(actualDateExpired, expectedDateExpired, "Date expire should be day after");

    }
}
