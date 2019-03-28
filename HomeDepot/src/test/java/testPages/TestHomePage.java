package testPages;

import base.MainAPI;
import org.openqa.selenium.support.FindBy;
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
    public void testTitle(){
        hp.title();
    }
    @Test
    public void testHomePage(){
        hp.title();
    }
    @Test
    public void testClickMyStore(){
        hp.clickMyStore();
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
    @Test
    public void testHelp(){
        hp.clickHelp();
    }
    @Test
    public void testClickCart(){
        hp.clickMyCart();
    }
    @Test
    public void testClickAllDepartment(){
        hp.clickDd_AllDepartment();
    }
    @Test
    public void testClickdd_Appliances(){
        hp.clickDd_Appliances();
    }
    @Test
    public void clickWallDecor(){
        hp.clickWallDecor();
    }
    @Test
    public void testWallAccents()throws Exception{
        hp.clickWallAccents();
    }


}
