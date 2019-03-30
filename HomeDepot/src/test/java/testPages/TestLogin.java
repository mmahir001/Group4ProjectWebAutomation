package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Login;

public class TestLogin extends MainAPI {
    Login login;
    @BeforeMethod
    public void initialize() {
        login = PageFactory.initElements(driver, Login.class);
    }

    @Test
    public void testLogin(){
        login.loginMyAccount();
    }
    @Test
    public void testWrongEmailLogin(){
        login.loginMyAccountWrongEmail();
    }
    @Test
    public void testWithoutEmailLogin(){
        login.loginMyAccountWithoutEmail();
    }
    @Test
    public void testWithoutPasswordLogin(){
        login.loginMyAccountWithoutPasssword();
    }
    @Test
    public void testWithoutEmailandPass(){
        login.loginMyAccountWithoutEmailPasssword();
    }




}
