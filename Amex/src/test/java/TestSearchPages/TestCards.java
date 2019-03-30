package TestSearchPages;

import SearchPages.Cards;
import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCards extends MainAPI {

    Cards cards;
    @BeforeMethod
    public void initialize() {
        cards = PageFactory.initElements(driver, Cards.class);
    }

    @Test
    public void TestCardOffer(){
        String actual = cards.clickCardOffers();
        String expected = "";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestFeatureCard(){
        String actual = cards.clickFeatureCard();
        String expected = "FEATURED CARDS";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestTravelCards(){
        String actual = cards.clickTravelcards();
        String expected = "";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestCashSBackCards(){
        String actual = cards.clickCashBackCards();
        String expected = "";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestRewardsCards(){
        String actual = cards.clickRewardsCards();
        String expected = "";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestGoldCars(){
        String actual = cards.goldCard();
        String expected = "";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void TestCashMagnet(){
        String actual = cards.clickCashMagnet();
        String expected = "";
        Assert.assertEquals (actual,expected);
    }



}
