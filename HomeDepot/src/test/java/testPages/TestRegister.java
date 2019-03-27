package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import pages.Register;

public class TestRegister extends MainAPI {
    Register register;
    @BeforeMethod
    public void initialize() {
        register = PageFactory.initElements(driver, Register.class);
    }

    @Test
    public void registerAccount() throws  Exception{
        register.clickMyAccount();

    }
}
