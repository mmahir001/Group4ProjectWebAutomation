package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Login;
import reporting.TestLogger;

public class TestLogin extends MainAPI {
    Login login;
    @BeforeMethod
    public void initialize() {
        login = PageFactory.initElements(driver, Login.class);
    }

    @Test
    public void testLogin() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login.loginMyAccount();
    }
    @Test
    public void testWrongEmailLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login.loginMyAccountWrongEmail();
    }
    @Test
    public void testWithoutEmailLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login.loginMyAccountWithoutEmail();
    }
    @Test
    public void testWithoutPasswordLogin(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login.loginMyAccountWithoutPasssword();
    }
    @Test
    public void testWithoutEmailandPass(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login.loginMyAccountWithoutEmailPasssword();
    }




}
