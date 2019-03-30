package testPages;

import base.MainAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;


import java.util.List;

public class TestHomePage extends MainAPI {
    HomePage hp;

    @BeforeMethod
    public void initialize() {
        hp = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testTitle(){
        hp.title();
    }
    @Test
    public void testHomePage(){
        hp.title();
    }
    @Test
    public void testClickMyStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickMyStore();
        String expected = "The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickStoreFinder(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickStoreFinder();
        String expected = "Store Finder";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickTruckTollRent(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickTruckToolRent();
        String expected = "Truck & Tool Rental";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickForThePro(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickForThePro();
        String expected = "For the Pro";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickGiftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickGiftCard();
        String expected = "Gift Cards";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickCreditServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickCreditServices();
        String expected = "Credit Services";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickFavorites(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickFavorites();
        String expected = "Favorites";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickTruckOrder(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickTrackOrder();
        String expected = "Track Order";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickHelp();
        String expected = "Help";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickMyCart();
        String expected = "Cart";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestHoverHover(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.hoveroversheds();
        String expected = "Sheds";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestHoverOverCarpet(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.hoveroverCarpet();
        String expected = "Carpet";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestClickSpecialOffers(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickSpecialOffer();
        String expected = "Specials & Offers";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestLocalAd(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = hp.clickLocalAd();
        String expected = "Local Ad";
        Assert.assertEquals (actual,expected);
    }

/////////////////////////////////////xlsx ///////////////////////////
    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List actual = hp.webElementList();
        List expected = hp.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }



}
