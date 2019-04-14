package tests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WomensPage;

public class WomensPageTester extends MainAPI {
    WomensPage womensPage;

    @BeforeMethod
    public void initilizeHomePage(){
        womensPage = PageFactory.initElements(driver, WomensPage.class);
    }

    @Test
    public void HoverOverWomen() throws Exception{
        womensPage.HoverOneWomen();
    }

    @Test
    public void NewArrivals() throws Exception{
        womensPage.goToNewArrivals1();
    }

    @Test
    public void Test4() throws Exception{
        womensPage.goToBestSeller1();
    }

    @Test
    public void Test5() throws Exception{
        womensPage.goToReleaseDate1();
    }

    @Test
    public void Test6() throws Exception{
        womensPage.goToYeezy1();
    }

    @Test
    public void Test7() throws Exception{
        womensPage.goToNiteJogger1();
    }

    @Test
    public void Test8() throws Exception{
        womensPage.goToUltraboost1();
    }

    @Test
    public void Test9() throws Exception{
        womensPage.goToContinental1();
    }

    @Test
    public void Test10() throws Exception{
        womensPage.goToSale1();
    }

    @Test
    public void Test11() throws Exception{
        womensPage.goToOriginals1();
    }

    @Test
    public void Test12() throws Exception{
        womensPage.goToRunning1();
    }

    @Test
    public void Test13() throws Exception{
        womensPage.goToWorkout1();
    }

    @Test
    public void Test14() throws Exception{
        womensPage.goToBasketball1();

    }

    @Test
    public void Test15() throws Exception{
        womensPage.goToEssentials1();
    }

    @Test
    public void Test16() throws Exception{
        womensPage.goToSandles1();
    }

    @Test
    public void Test17() throws Exception{
        womensPage.goToHiking1();
    }

    @Test
    public void Test18() throws Exception{
        womensPage.goToTennis1();
    }

    @Test
    public void Test19() throws Exception{
        womensPage.goToGolf1();
    }

    @Test
    public void Test20() throws Exception{
        womensPage.goToSoccer1();
    }

    @Test
    public void Test21() throws Exception{
        womensPage.goToVolleyball1();
    }

    @Test
    public void Test22() throws Exception{
        womensPage.goToHoodies1();
    }

    @Test
    public void Test23() throws Exception{
        womensPage.goToPants1();
    }

    @Test
    public void Test24() throws Exception{
        womensPage.goToLeggings();
    }

    @Test
    public void Test25() throws Exception{
        womensPage.goToBags1();
    }

    @Test
    public void Test26() throws Exception{
        womensPage.goToHats();
    }

    @Test
    public void Test27() throws Exception{
        womensPage.goToSocks1();
    }

    @Test
    public void Test28() throws Exception{
        womensPage.goToBostonMarathon1();
    }
}
