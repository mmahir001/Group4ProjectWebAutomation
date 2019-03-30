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
    public void TestCreateAccount() throws  Exception{

        String actual = register.createAccount();
        String expected = "The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestCreateAccountWithoutEmail(){
        String actual = register.creatAccountwithoutemail();
        String expected = "The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestOrderAndPurchases(){
        String actual = register.clickOrderandPurchases();
        String expected = "Orders & Purchases";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestClickMyCreditCard() throws Exception {
        String actual = register.clickMyCreditCard();
        String expected = "My Credit Card Account";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestAccountProfile(){
        String actual = register.clickAccountProfile();
        String expected = "Account Profile";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestFavorites(){
        String actual = register.clickFavorites();
        String expected = "Favorites";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestFindList() throws Exception {
        String actual = register.clickFindList();
        String expected = "Find a List";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestMySubscriptions(){
        String actual = register.clickMySubscriptions();
        String expected = "My Subscriptions";
        Assert.assertEquals (actual,expected);
    }



}
