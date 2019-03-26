package bases;

import base.Home;
import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends MainAPI {

    Home home;
    String homeUrl = "https://www.target.com/";

    @BeforeMethod

    public void initialize() {
        driver.navigate().to(homeUrl);
       home = PageFactory.initElements(driver, Home.class);

    }

    @Test
    public void getTitle()throws Exception{
        driver.getTitle();
        String title = "Target : Expect More. Pay Less.";
        Assert.assertEquals(driver.getTitle(),title);
    }

    @Test
    public  void enterSearchBox() {
        home.clickOnElement("pillow");
        String urlExpected = "https://www.target.com/s?searchTerm=pillows";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    @Test
    public void navigateToCategories() throws Exception {
        home.categories();
        Thread.sleep(3000);
    }

    @Test
    public void navigateToSignIn() {
        home.signInPage();
    }
    @Test
    public void navigateToDeals() {
        home.deals();
    }
    @Test
    public void navigateToFIndAStore() {
        home.categories();
    }
    @Test
    public void navigateToBabyBedding() {
        home.babyBedding();
    }
    @Test
    public void navigateToTargetGiftCard() {
        home.targetGiftCard();


    }
}

