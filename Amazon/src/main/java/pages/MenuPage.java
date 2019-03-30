package pages;

import base.MainAPI;
import base.MainAPI;
import freemarker.cache.StringTemplateLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuPage extends MainAPI {


    @FindBy(id = "nav-your-amazon")
    public static WebElement yourAmazonTab;

    public String clickYourAmazonTab() {
        yourAmazonTab.click();
        String text = driver.getTitle();
        return text;

    }

    @FindBy(xpath = "//a[contains(text(),\"Today's Deals\")]")
    public static WebElement today_deal;

    public String clickTodayDeal() {
        today_deal.click();
        String text = today_deal.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='nav-a'][contains(text(),'Gift Cards')]")
    public static WebElement giftCards;

    public String clickgiftCards() {
        giftCards.click();
        String text = giftCards.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='nav-a'][contains(text(),'c')]")
    public static WebElement wholeFoods;

    public String clickWholeFoods() {
        wholeFoods.click();
        String text = wholeFoods.getText();
        return text;
    }

    @FindBy(xpath = "//span[@class='nav-line-2'][contains(text(),'Orders')]")
    public static WebElement orders;

    public String clickorders() {
        orders.click();
        String text = orders.getText();
        return text;

    }

    @FindBy(xpath = "//a[contains(text(),'Registry')]")
    public static WebElement registry;

    public String clickregistry() {
        registry.click();
        String text = orders.getText();
        return text;
    }

    @FindBy(xpath = "//span[@class='nav-line-2'][contains(text(),'Try Prime')]")
    WebElement prime;

    public String clickprime() {
        prime.click();
        String text = prime.getText();
        return text;
    }

    @FindBy(xpath = "//span[@id='glow-ingress-line1']")
    public static WebElement deliverto;

    public String clickdeliverTo() {
        deliverto.click();
        String text = deliverto.getText();
        return text;
    }

    @FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']")
    WebElement cart;

    public String clickcart() {
        cart.click();
        String text = cart.getText();
        return text;
    }

    @FindBy(xpath = "//body[@class='a-m-us a-aui_149818-c a-aui_152852-c a-aui_157141-c a-aui_158613-c a-aui_160684-c a-aui_57326-c a-aui_72554-c a-aui_accessibility_49860-c a-aui_attr_validations_1_51371-c a-aui_bolt_62845-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_113788-c a-aui_ux_114039-c a-aui_ux_145937-c a-aui_ux_60000-c a-meter-animate']")
    public static WebElement thankyou;

    public String clickthakyou() {
        thankyou.click();
        String text = cart.getText();
        return text;
    }

    @FindBy(xpath = "//div[contains(text(),'Get to Know Us')]")
    public static WebElement get_to_know;

    public String clickget_to_know() {
        get_to_know.click();
        String text = cart.getText();
        return text;
    }
    //@FindBy(xpath = "//span[@class='a-size-small a-color-base s-ref-text-link s-ref-link-cursor'][contains(text(),'eGift Card')]" )
    //public static WebElement eGiftCard;

    //public void clickeGiftCard(){
    //  eGiftCard.click();
    //}
    //@FindBy(xpath = "//span[contains(text(),'Mail')]")
    //public static WebElement Mail;

    // public void clickMail(){
    // Mail.click();
    //}
    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    public static WebElement hamburgerTab;


    @FindBy(xpath = "//div[@id='hmenu-container']//li[2]//a[1]")
    public static WebElement primeVideo;



    public String clickPrimeVideo(){

        hamburgerTab.click();
        primeVideo.click();
        String text = primeVideo.getText();
        return text;
    }
    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//li[3]//a[1]")
    public static WebElement amazonMusic;

    public String clickamazonMusic(){
        hamburgerTab.click();
        amazonMusic.click();
        String text = primeVideo.getText();
        return text;
    }
    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//li[4]//a[1]")
    public static WebElement echoAndAlexa;

    public String clickechoAndAlexa(){
        hamburgerTab.click();
        echoAndAlexa.click();
        String text = echoAndAlexa.getText();
        return text;

    }
    @FindBy(xpath = "//div[contains(text(),'Fire Tablets')]")
    public static WebElement fireTablets;

    public String clickfireTablets(){
        hamburgerTab.click();
        fireTablets.click();
        String text = fireTablets.getText();
        return text;

    }
    @FindBy(xpath = "//ul[contains(@class,'hmenu-visible')]//li[6]//a[1]")
    public static WebElement fireTv;

    public String clickfireTv(){
        hamburgerTab.click();
        fireTv.click();
        String text = fireTv.getText();
        return text;

    }
    @FindBy(xpath = "//div[contains(text(),'Kindle E-readers & Books')]")
    public static WebElement Kindle;

    public String clickKindle(){
        hamburgerTab.click();
        Kindle.click();
        String text = fireTv.getText();
        return text;


    }
    @FindBy(xpath = "//div[contains(text(),'Appstore for Android')]")
    public static WebElement appstore;

    public String clickappstore(){
        hamburgerTab.click();
        appstore.click();
        String text = appstore.getText();
        return text;
    }
    @FindBy(xpath = "//div[contains(text(),'Clothing, Shoes, Jewelry & Watches')]")
    public static WebElement clothing;

    public String clickclothing(){
        hamburgerTab.click();
        clothing.click();
        String text = clothing.getText();
        return text;
    }
    @FindBy(xpath = "//ul[contains(@class,'hmenu-visible')]//div[contains(text(),'AmazonFresh')]")
    public static WebElement amazonFresh;

    public String clickamazonFresh(){
        hamburgerTab.click();
        amazonFresh.click();
        String text = amazonFresh.getText();
        return text;
    }
    @FindBy(xpath = "//div[contains(text(),'Books & Audible')]")
    public static WebElement books;

    public String clickbooks(){
        hamburgerTab.click();
        books.click();
        String text = books.getText();
        return text;

    }
    @FindBy(xpath = "//div[contains(text(),'Movies, Music & Games')]")
    public static WebElement moviesMusic;

    public String clickmoviesMusic(){
        hamburgerTab.click();
        moviesMusic.click();
        String text = moviesMusic.getText();
        return text;

    }
    @FindBy(xpath = "//div[contains(text(),'Electronics, Computers & Office')]")
    public static WebElement electronics;

    public String clickelectronics(){
        hamburgerTab.click();
        electronics.click();
        String text = electronics.getText();
        return text;
    }
    @FindBy(xpath = "//ul[@class='hmenu hmenu-translateX']//li[15]//a[1]")
    public static WebElement alexa;

    public String clickalexa(){
        hamburgerTab.click();
        alexa.click();
        String text = alexa.getText();
        return text;
    }
    @FindBy(xpath = "//div[contains(text(),'Home, Garden & Tools')]")
    public static WebElement home_garden;

    public String clickhome_garden(){
        hamburgerTab.click();
        home_garden.click();
        String text = home_garden.getText();
        return text;
    }
    @FindBy(xpath = "//ul[@class='hmenu hmenu-translateX hmenu-visible']//div[contains(text(),'Pet Supplies')]")
    public static WebElement pet_supplies;

    public String clickpet_supplies(){
        hamburgerTab.click();
        pet_supplies.click();
        String text = pet_supplies.getText();
        return text;
    }
    @FindBy(xpath = "//div[contains(text(),'Food & Grocery')]")
    public static WebElement food_grocery;

    public String clickfood_grocery(){
        hamburgerTab.click();
        food_grocery.click();
        String text = food_grocery.getText();
        return text;

    }
    @FindBy(xpath = "//div[contains(text(),'Beauty & Health')]")
    public static WebElement beauty_health;

    public String clickbeauty_health(){
        hamburgerTab.click();
        beauty_health.click();
        String text = beauty_health.getText();
        return text;



    }
    @FindBy(xpath = "//div[contains(text(),'Toys, Kids & Baby')]")
    public static WebElement toys_kids_baby;

    public String clicktoys_kids_baby(){
        hamburgerTab.click();
        toys_kids_baby.click();
        String text = toys_kids_baby.getText();
        return text;


    }
    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[21]//a[1]")
    public static  WebElement handmade;

    public String clickhandmade(){
        hamburgerTab.click();
        handmade.click();
        String text = handmade.getText();
        return text;

    }





}
