package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchBox;

public class TestHomePage extends MainAPI {
    HomePage hp;

    @BeforeMethod
    public void initialize() {
        hp = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testHomePage(){
        hp.title();
    }
    @Test
    public void testMyStore(){
        hp.myStore();
    }
    @Test
    public void testCheckCart(){
        hp.checkCart();
    }


}
