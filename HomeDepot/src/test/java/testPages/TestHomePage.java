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
    public void testClickStoreFinder(){
        hp.clickStoreFinder();
    }
    @Test
    public void testClickTruckTollRent(){
        hp.clickTruckToolRent();
    }
    @Test
    public void testClickForThePro(){
        hp.clickFotThePro();
    }
    @Test
    public void testClickGiftCard(){
        hp.clickGiftCard();
    }
    @Test
    public void testClickCreditServices(){
        hp.clickCreditServices();
    }
    @Test
    public void testClickFavorites(){
        hp.clickFavorites();
    }
    @Test
    public void testClickTruckOrder(){
        hp.clickTrackOrder();
    }

}
