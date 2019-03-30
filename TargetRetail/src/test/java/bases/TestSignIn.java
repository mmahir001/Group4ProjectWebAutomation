package bases;

import base.Categories;
import base.Home;
import base.MainAPI;
import base.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignIn extends MainAPI {

    SignIn signIn;
    String signInUrl = "https://www.target.com/?clkid=36998e8eN501111e9ba56060acead98a1&lnm=79373&afid=CitizenHawk&ref=tgt_adv_xasd0002";

    @BeforeMethod

    public void initialize() {
        driver.navigate().to(signInUrl);
        signIn =PageFactory.initElements(driver, SignIn.class);
    }
    @Test
    public void testSignIn(){
        signIn.signInMyAccount();

    }

}
