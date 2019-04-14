package tests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTester extends MainAPI {
    MainPage mainPage;

    @BeforeMethod
    public void initilizeHomePage(){
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void VerifyTitle(){mainPage.title();
    }

    @Test
    public void clickMen() throws Exception{
        mainPage.HoverOneMen();
    }

    @Test
    public void NewArrivals() throws Exception{
        mainPage.goToNewArrivals();
    }

    @Test
    public void Test4() throws Exception{
        mainPage.goToBestSellers();
    }

    @Test
    public void Test5() throws Exception{
        mainPage.goToReleaseDate();
    }

    @Test
    public void Test6() throws Exception{
        mainPage.goToYeezy();
    }

    @Test
    public void Test7() throws Exception{
        mainPage.goToNiteJogger();
    }

    @Test
    public void Test8() throws Exception{
        mainPage.goToUltraboost();
    }

    @Test
    public void Test9() throws Exception{
        mainPage.goToContinental();
    }

    @Test
    public void Test10() throws Exception{
        mainPage.goToSale();
    }

    @Test
    public void Test11() throws Exception{
        mainPage.goToOriginals();
    }

    @Test
    public void Test12() throws Exception{
        mainPage.goToRunning();
    }

    @Test
    public void Test13() throws Exception{
        mainPage.goToSoccer();
    }

    @Test
    public void Test14() throws Exception{
        mainPage.goToBasketball();
    }

    @Test
    public void Test15() throws Exception{
        mainPage.goToFootball();
    }

    @Test
    public void Test16() throws Exception{
        mainPage.goToSkate();
    }

    @Test
    public void Test17() throws Exception{
        mainPage.goToWorkout();
    }

    @Test
    public void Test18() throws Exception{
        mainPage.goToEssentials();
    }

    @Test
    public void Test19() throws Exception{
        mainPage.goToSandals();
    }

    @Test
    public void Test20() throws Exception{
        mainPage.goToHiking();
    }

    @Test
    public void Test21() throws Exception{
        mainPage.goToGolf();
    }

    @Test
    public void Test22() throws Exception{
        mainPage.goToTennis();
    }

    @Test
    public void Test23() throws Exception{
        mainPage.goToBaseball();
    }

    @Test
    public void Test24() throws Exception{
        mainPage.goToPants();
    }

    @Test
    public void Test25() throws Exception{
        mainPage.goToHoodies();
    }

    @Test
    public void Test26() throws Exception{
        mainPage.goToJackets();
    }

    @Test
    public void Test27() throws Exception{
        mainPage.goToTrack();
    }

    @Test
    public void Test28() throws Exception{
        mainPage.goToShortSleeves();
    }

    @Test
    public void Test29() throws Exception{
        mainPage.goToGraphic();
    }

    @Test
    public void Test30() throws Exception{
        mainPage.goToLongSleeves();
    }

    @Test
    public void Test31() throws Exception{
        mainPage.goToJersey();
    }

    @Test
    public void Tes32() throws Exception{
        mainPage.goToTights();
    }

    @Test
    public void Test33() throws Exception{
        mainPage.goToShorts();
    }

    @Test
    public void Test34() throws Exception{
        mainPage.goToTankTops();
    }

    @Test
    public void Test35() throws Exception{
        mainPage.goToBags();
    }

    @Test
    public void Test36() throws Exception{
        mainPage.goToHats();
    }

    @Test
    public void Test37() throws Exception{
        mainPage.goToBostonMarathon();
    }

    @Test
    public void Test38() throws Exception{
        mainPage.goToBalls();
    }

    @Test
    public void Test39() throws Exception{
        mainPage.goToGloves();
    }

    @Test
    public void Test40() throws Exception{
        mainPage.goToAccessories();
    }

}
