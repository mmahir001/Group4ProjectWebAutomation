package testPages;

import base.MainAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MenuPage;
import reporting.TestLogger;

public class TestMenuPages extends MainAPI {

    MenuPage mp;
    @BeforeMethod
    public void initialize(){

        mp = PageFactory.initElements(driver, MenuPage.class);
    }

    @Test
    public void testTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String st = driver.getTitle();
        Assert.assertEquals(st, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @Test
    public void testClickAmazonTab(){
        mp.clickYourAmazonTab();
        String actual = mp.clickYourAmazonTab();
        String expected = "";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testClickTodayDeal(){
        mp.clickTodayDeal();
        String actual = mp.clickTodayDeal();
        String expected = "Today's Deals";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickGiftCards(){
        mp.clickgiftCards();
        String actual = mp.clickgiftCards();
        String expected = "Gift Cards";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickWholeFoods(){
        mp.clickWholeFoods();
        String actual = mp.clickWholeFoods();
        String expected = "Whole Foods";
        Assert.assertEquals(actual,expected);


    }
    @Test
    public void testClickorders(){
        mp.clickorders();
        String actual = mp.clickorders();
        String expected = "Orders";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickregistry(){
        mp.clickregistry();
        String actual = mp.clickregistry();
        String expected = "Registry";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickprime(){
        String actual = mp.clickprime();
        String expected = "Try Prime";
        Assert.assertEquals(actual,expected);
    }
   @Test
    public void testClickdeliverTo()throws Exception{
       String actual =  mp.clickdeliverTo();
       String expected = "Deliver to";
       Assert.assertEquals(actual,expected);
   }
   @Test
    public void testClickcart(){
        String actual = mp.clickcart();
       String expected = "";
       Assert.assertEquals(actual,expected);
   }
   @Test
    public void testClickthankyou(){
        String actual = mp.clickthakyou();
       String expected = "";
       Assert.assertEquals(actual,expected);
   }
   @Test
    public void testClicget_to_know() {
       String actual = mp.clickget_to_know();
       String expected = "";
       Assert.assertEquals(actual,expected);

   }

   @Test
    public void testClickPrimeVideo(){
        String actual = mp.clickPrimeVideo();
       String expected = "Prime Video";
       Assert.assertEquals(actual,expected);
   }
    @Test
    public void testClickechoAndAlexa(){
        String actual = mp.clickechoAndAlexa();
        String expected = "";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void testClickechoFireTablets(){
        String actual = mp.clickfireTablets();
        String expected = "Fire Tablets";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void testClickfireTv(){
        String actual = mp.clickfireTv();
        String expected = "Fire TV Recast";
        Assert.assertEquals(actual,expected);


    }
    @Test
    public void testClickKindle(){
        String actual = mp.clickKindle();
        String expected = "Kindle for Kids Bundle";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void testClickappstore(){
        String actual = mp.clickappstore();
        String expected = "Appstore for Android";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void testclickclothing(){
        String actual = mp.clickclothing();
        String expected = "Clothing, Shoes, Jewelry & Watches";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testclickamazonFresh(){
       String actual =  mp.clickamazonFresh();
        String expected = "";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testclickbooks(){
        String actual = mp.clickbooks();
        String expected = "Books & Audible";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testclickmoviesMusic(){
        String actual = mp.clickmoviesMusic();
        String expected = "Movies, Music & Games";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testclickelectronics(){
        String actual = mp.clickelectronics();
        String expected = "Electronics, Computers & Office";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testalexa(){
        String actual = mp.clickalexa();
        String expected = "";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testhome_garden(){
       String actual =  mp.clickhome_garden();
        String expected = "Home, Garden & Tools";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testpet_suplies(){
        String actual = mp.clickpet_supplies();
        String expected = "";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testfood_grocery(){
        String actual = mp.clickfood_grocery();
        String expected = "Food & Grocery";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void beauty_health(){
        String actual = mp.clickbeauty_health();
        String expected = "Beauty & Health";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void toys_kids_baby(){
        String actual = mp.clicktoys_kids_baby();
        String expected = "Toys, Kids & Baby";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void handmade(){
        String actual = mp.clickhandmade();
        String expected = "hmenu hmenu-visible hmenu-translateX";
        Assert.assertEquals(actual,expected);
    }





}
