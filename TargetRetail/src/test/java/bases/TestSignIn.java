package bases;

import base.Categories;
import base.Home;
import base.MainAPI;
import base.SignIn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

public class TestSignIn extends MainAPI {

    SignIn signIn;

    @BeforeMethod

    public void initialize() {
        signIn =PageFactory.initElements(driver, SignIn.class);
    }

    @Test
    public void testSignIn(){
        signIn.loginMyAccount();
    }
    @Test
    public void testWrongEmailLogin(){
        signIn.loginMyAccountWrongEmail();
    }
    @Test
    public void testWithoutEmailLogin(){
        signIn.loginMyAccountWithoutEmail();
    }
    @Test
    public void testWithoutPasswordLogin(){
        signIn.loginMyAccountWithoutPasssword();
    }
    @Test
    public void testWithoutEmailandPass(){
        signIn.loginMyAccountWithoutEmailPasssword();
    }


}
