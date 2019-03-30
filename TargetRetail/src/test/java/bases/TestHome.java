package bases;

import base.Categories;
import base.Home;
import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends MainAPI {


    Home home;
    String homeUrl = "https://www.target.com/?clkid=36998e8eN501111e9ba56060acead98a1&lnm=79373&afid=CitizenHawk&ref=tgt_adv_xasd0002";

    @BeforeMethod

    public void initialize() {
        driver.navigate().to(homeUrl);
        home = PageFactory.initElements(driver, Home.class);
    }
    @Test
    public void navigateToCart() {
        home.clickCart();
        String actule = home.clickCart();
        String expected = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actule,expected);

    }
    @Test
    public void navigateToSearch() {
        home.clickSearchBox();
        String actule =home.clickSearchBox();
        String expected = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actule,expected);
    }

    @Test
    public void navigateToSignIn() {
        home.clickSignIn();
    }
    @Test
    public void navigateToTreading() {
        home.clickTreading();
    }
    @Test
    public void navigateToDeals() {
        home.clickDeals();
    }
    @Test
    public void navigateToFindStore() {
        home.clickFindStore();
    }
    @Test
    public void navigateToTargetGiftCard() {
        home.clickTargetGiftCard();
    }
    @Test
    public void navigateToWeeklyAd() {
        home.clickWeeklyAd();
    }
    @Test
    public void navigateToRegistriesLists() {
        home.clickRegistriesList();
    }
    @Test
    public void navigateToOrder() {
        home.clickOrder();
    }
}
