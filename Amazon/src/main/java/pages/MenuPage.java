package pages;

import base.MainAPI;
import base.MainAPI;
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


    @FindBy(id ="nav-your-amazon")
    public static WebElement yourAmazonTab;

    public void clickYourAmazonTab(){
        yourAmazonTab.click();
    }
    @FindBy(xpath = "//a[contains(text(),\"Today's Deals\")]")
    public static WebElement today_deal;

    public void clickTodayDeal(){
        today_deal.click();
    }

    @FindBy(xpath = "//a[@class='nav-a'][contains(text(),'Gift Cards')]")
    public static WebElement giftCards;

    public void clickgiftCards(){
        giftCards.click();
    }
    @FindBy(xpath ="//a[@class='nav-a'][contains(text(),'Whole Foods')]")
    public static WebElement wholeFoods;

    public void clickWholeFoods(){
        wholeFoods.click();
    }
    @FindBy(xpath = "//a[@class='nav-a'][contains(text(),'Sell')]")
    public static WebElement sell;

    public void clickSell(){
        sell.click();

    }
    @FindBy(xpath = "//a[contains(text(),'Registry')]")
    public static WebElement registry;

    public void clickRegistry(){
        registry.click();
    }
    @FindBy(xpath = "//a[@class='nav-a'][contains(text(),'Help')]")
    WebElement help;

    public void clickHelp(){
        help.click();
    }
    @FindBy(xpath = "//span[@id='glow-ingress-line1']")
    public static WebElement deliverto;

    public void clickDeliverTo(){
        deliverto.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Birthdays')]" )
    WebElement birthday;

    public void clickBirthday(){
        birthday.click();
    }
    @FindBy(xpath = "//body[@class='a-m-us a-aui_149818-c a-aui_152852-c a-aui_157141-c a-aui_158613-c a-aui_160684-c a-aui_57326-c a-aui_72554-c a-aui_accessibility_49860-c a-aui_attr_validations_1_51371-c a-aui_bolt_62845-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_113788-c a-aui_ux_114039-c a-aui_ux_145937-c a-aui_ux_60000-c a-meter-animate']" )
    public static WebElement thankyou;

    public void clickthakyou(){
        thankyou.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Congratulations')]")
    public static WebElement congratulations;

    public void clickcongratulations(){
        congratulations.click();
    }
    @FindBy(xpath = "//span[@class='a-size-small a-color-base s-ref-text-link s-ref-link-cursor'][contains(text(),'eGift Card')]" )
    public static WebElement eGiftCard;

    public void clickeGiftCard(){
        eGiftCard.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Mail')]")
    public static WebElement Mail;

    public void clickMail(){
        Mail.click();
    }
    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    public static WebElement hamburgerTab;

    @FindBy(xpath = "//div[@id='hmenu-container']//li[2]//a[1]")
    public static WebElement primeVideo;



    public void clickPrimeVideo(){

        hamburgerTab.click();
        primeVideo.click();
    }
    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//li[3]//a[1]")
    public static WebElement amazonMusic;

    public void clickamazonMusic(){
        hamburgerTab.click();
        amazonMusic.click();
    }
    @FindBy(xpath = "//ul[contains(@class,'hmenu-visible')]//li[4]//a[1]")
    public static WebElement echoAndAlexa;

    public void clickechoAndAlexa(){
        hamburgerTab.click();
        echoAndAlexa.click();

    }
    @FindBy(xpath = "//div[contains(text(),'Fire Tablets')]")
    public static WebElement fireTablets;

    public void clickfireTablets(){
        hamburgerTab.click();
        fireTablets.click();
    }
    @FindBy(xpath = "//ul[contains(@class,'hmenu-visible')]//li[6]//a[1]")
    public static WebElement fireTv;

    public void clickfireTv(){
        hamburgerTab.click();
        fireTv.click();
    }
    @FindBy(xpath = "//div[contains(text(),'Kindle E-readers & Books')]")
    public static WebElement Kindle;

    public void clickKindle(){
        hamburgerTab.click();
        Kindle.click();

    }
    @FindBy(xpath = "//div[contains(text(),'Appstore for Android')]")
    public static WebElement appstore;

    public void clickappstore(){
        hamburgerTab.click();
        appstore.click();
    }
    @FindBy(xpath = "//div[contains(text(),'Clothing, Shoes, Jewelry & Watches')]")
    public static WebElement clothing;

    public void clickclothing(){
        hamburgerTab.click();
        clothing.click();
    }
    @FindBy(xpath = "//ul[contains(@class,'hmenu-visible')]//div[contains(text(),'AmazonFresh')]")
    public static WebElement amazonFresh;

    public void clickamazonFresh(){
        hamburgerTab.click();
        amazonFresh.click();
    }
    @FindBy(xpath = "//div[contains(text(),'Books & Audible')]")
    public static WebElement books;

    public void clickbooks(){
        hamburgerTab.click();
        books.click();
    }
    @FindBy(xpath = "//div[contains(text(),'Movies, Music & Games')]")
    public static WebElement moviesMusic;

    public void clickmoviesMusic(){
        hamburgerTab.click();
        moviesMusic.click();
    }
    @FindBy(xpath = "//div[contains(text(),'Electronics, Computers & Office')]")
    public static WebElement electronics;

    public void clickelectronics(){
        hamburgerTab.click();
        electronics.click();
    }





}
