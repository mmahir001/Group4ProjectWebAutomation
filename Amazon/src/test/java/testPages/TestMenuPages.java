package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MenuPage;

public class TestMenuPages extends MainAPI {

    MenuPage mp;
    @BeforeMethod
    public void initialize(){

        mp = PageFactory.initElements(driver, MenuPage.class);
    }

    @Test
    public void testTitle() throws  NullPointerException{
        mp.title();


    }
    @Test
    public void testClickAmazonTab(){
        mp.clickYourAmazonTab();
    }

    @Test
    public void testClickTodayDeal(){
        mp.clickTodayDeal();
    }
    @Test
    public void testClickGiftCards(){
        mp.clickgiftCards();
    }
    @Test
    public void testClickWholeFoods(){
        mp.clickWholeFoods();
    }




}
