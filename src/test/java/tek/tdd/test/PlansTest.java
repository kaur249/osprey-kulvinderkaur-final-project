package tek.tdd.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedCurrentDate = currentDate.format(formatter);

        String actualDateCreated = getElementText(plansPage.dateCreated);
        Assert.assertEquals(actualDateCreated, formattedCurrentDate, "Date created should match Today's Date");

        // Assert that the expiration date is April 30
        LocalDate dateAfterCurrent = currentDate;
        String formattedDateAfterCurrent = dateAfterCurrent.format(formatter);
        String actualDateExpired = getElementText(plansPage.dateCreated);
        Assert.assertEquals(actualDateExpired, formattedDateAfterCurrent, "Date expire should be day after");

        // Assert that the second expiration date is May 1
        LocalDate dateAfterTwoDays = currentDate.plusDays(1);
        String formattedDateAfterTwoDays = dateAfterTwoDays.format(formatter);
        String actualDateExpiredTwoDays = getElementText(plansPage.dateExpired);
        Assert.assertEquals(actualDateExpiredTwoDays, formattedDateAfterTwoDays, "Second expiration date should be two days after");

        /*LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedCurrentDate = currentDate.format(formatter);

        String actualDateCreated = getElementText(plansPage.dateCreated);
        Assert.assertEquals(actualDateCreated, formattedCurrentDate, "Date created should match Today's Date");

        LocalDate dateAfterCurrent = currentDate.plusDays(1);
        String formattedDateAfterCurrent = dateAfterCurrent.format(formatter);
        String actualDateExpired = getElementText(plansPage.dateExpired);
        Assert.assertEquals(actualDateExpired, formattedDateAfterCurrent, "Date expire should be day after");

         */
    }

        /*String actualDateCreated = getElementText(plansPage.dateCreated);
        String expectedDateCreated = "April 29, 2024";
        Assert.assertEquals(actualDateCreated, expectedDateCreated, "Date created should match Today's Date");

        String actualDateExpired = getElementText(plansPage.dateExpired);
        String expectedDateExpired = "April 30, 2024";
        Assert.assertEquals(actualDateExpired, expectedDateExpired,
         "Date expire should be day after");

         */

    }

