package bases;

import base.Home;
import base.MainAPI;
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
        String actual = home.clickCart();
        String expected = "cart 0 items";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void navigateToSearch() {
        String actual =home.clickSearchBox();
        String expected = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToSignIn() {
        String actual = home.clickSignIn();
        String expected = "my account\n" +
                "Sign in";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToTreding() {
        String actual = home.clickTreading();
        String expected = "Trending";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToDeals() {
        String actual =home.clickDeals();
        String expected = "Deals";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToFindStore() {
        String actual =home.clickFindStore();
        String expected = "Find Stores";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToTargetGiftCard() {
        String actual =home.clickTargetGiftCard();
        String expected = "Gift Cards";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToWeeklyAd() {
        String actual =home.clickWeeklyAd();
        String expected = "Weekly Ad";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToRegistriesLists() {
        String actual =home.clickRegistriesList();
        String expected = "Registries List";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void navigateToOrder() {
        home.clickOrder();
        String actual =home.clickOrder();
        String expected = "Order";
        Assert.assertEquals(actual,expected);
    }
}
