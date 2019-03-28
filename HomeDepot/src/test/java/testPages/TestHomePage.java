package testPages;

import base.MainAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
    public void testTitle(){
        hp.title();
    }
    @Test
    public void testHomePage(){
        hp.title();
    }
    @Test
    public void testClickMyStore(){
        String actual = hp.clickMyStore();
        String expected = "The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickStoreFinder(){
        String actual = hp.clickStoreFinder();
        String expected = "Store Finder";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickTruckTollRent(){
        String actual = hp.clickTruckToolRent();
        String expected = "Truck & Tool Rental";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickForThePro(){
        String actual = hp.clickForThePro();
        String expected = "For the Pro";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickGiftCard(){
        String actual = hp.clickGiftCard();
        String expected = "Gift Cards";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickCreditServices(){
        String actual = hp.clickCreditServices();
        String expected = "Credit Services";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickFavorites(){
        String actual = hp.clickFavorites();
        String expected = "Favorites";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickTruckOrder(){
        String actual = hp.clickTrackOrder();
        String expected = "Track Order";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testHelp(){
        String actual = hp.clickHelp();
        String expected = "Help";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickCart(){
        String actual = hp.clickMyCart();
        String expected = "Cart";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickAllDepartment(){
        String actual = hp.clickDd_AllDepartment();
        String expected = "All Departments";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickdd_Appliances(){ ;
        String actual = hp.clickDd_Appliances();
        String expected = "Appliancesl";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testclickHomeDecor(){
        String actual = hp.clickHomeDecor();
        String expected = "Shop Home Decor at the Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testWallAccents()throws Exception{
        String actual = hp.clickWallAccents();
        String expected = "Wall Accents";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickFurniture(){
        String actual = hp.clickFurniture();
        String expected = "Shop Furniture at The Home Depot";
        Assert.assertEquals(actual,expected);
    }


}
