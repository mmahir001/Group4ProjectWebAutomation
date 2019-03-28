package testPages;

import base.MainAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
    public void testTitle(){
        String st = driver.getTitle();
        Assert.assertEquals(st, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
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
    @Test
    public void testClickSell()throws Exception{
        mp.clickSell();
    }
    @Test
    public void testClickRegistry()throws Exception{
        mp.clickRegistry();
    }
    @Test
    public void testClickHelp()throws InterruptedException,NullPointerException{
        mp.clickHelp();
        MainAPI.sleepForTwoSec();
    }
   @Test
    public void testClickDeliverTo()throws Exception{
        mp.clickDeliverTo();
   }
   @Test
    public void testClickbirthday(){
        mp.clickBirthday();
   }
   @Test
    public void testClickthankyou(){
        mp.clickthakyou();
   }
   @Test
    public void testClickcongratulations() {
       mp.clickcongratulations();
   }

    @Test
    public void testClickPrimeVideo(){
        mp.clickPrimeVideo();
    }
    @Test
    public void testClickAmazonMusic(){
        mp.clickamazonMusic();
    }
    @Test
    public void testClickechoAndAlexa(){
        mp.clickechoAndAlexa();

    }
    @Test
    public void testClickechoFireTablets(){
        mp.clickfireTablets();
    }
    @Test
    public void testClickfireTv(){
        mp.clickfireTv();
    }
    @Test
    public void testClickKindle(){
        mp.clickKindle();
    }
    @Test
    public void testClickappstore(){
        mp.clickappstore();
    }
    @Test
    public void testclickclothing(){
        mp.clickclothing();
    }
    @Test
    public void testclickamazonFresh(){
        mp.clickamazonFresh();
    }
    @Test
    public void testclickbooks(){
        mp.clickbooks();
    }
    @Test
    public void testclickmoviesMusic(){
        mp.clickmoviesMusic();
    }
    @Test
    public void testclickelectronics(){
        mp.clickelectronics();
    }












}
