package tek.tdd.test;

import org.testng.annotations.DataProvider;
import tek.tdd.base.BaseUITest;

public class UserProfileTest extends BaseUITest {

    @DataProvider(name= "validCredentials")
    public String [][] validCredentialProvider(){
        String [][] data= {
                {"supervisor","tek_supervisor" }
        };
        return data;
    }


    // Validate Profile Slide Drawer is correct
}
