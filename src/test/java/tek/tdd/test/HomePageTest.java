package tek.tdd.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.tdd.base.BaseUITest;

public class HomePageTest extends BaseUITest {

    @Test
    public void TekInsuranceLogo(){
        boolean isDisplayed= isElementDisplayed(homepage.TekInsuranceInfo);
        Assert.assertTrue(isDisplayed,
                "Top Left corner Tek Insurance should be displayed");

    }

    @Test
    public void CreatePrimaryAccount(){
        /*boolean isDisplayed= isElementDisplayed(homepage.CreatePrimaryAccountButton);
        Assert.assertTrue(isDisplayed,
                "Create Primary Account Button should be displayed");
         */
        String expectedTitle = "Create Primary Account";
        String actualTitle = getElementText(homepage.CreatePrimaryAccount);
        Assert.assertEquals(actualTitle, expectedTitle, "The expected should be displayed");

    }

    @Test
    public void ValidateLetsGetYouStartedButton(){
    boolean isDisplayed= isElementDisplayed(homepage.LetsGetYouStartedButton);
    Assert.assertTrue(isDisplayed,
            "Let's get you started Button should be displayed");

}
}