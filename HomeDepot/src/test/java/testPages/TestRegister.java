package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import pages.Register;
import reporting.TestLogger;

import java.util.List;

public class TestRegister extends MainAPI {
    Register register;
    @BeforeMethod
    public void initialize() {
        register = PageFactory.initElements(driver, Register.class);
    }

    @Test
    public void CreateAccount() throws  Exception{

        String actual = register.clickMyAccount();
        String expected = "The Home Depot";
        Assert.assertEquals (actual,expected);
    }


}
