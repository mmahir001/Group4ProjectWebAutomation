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



    public void title(){
      String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

    }

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
    public static WebElement help;

    public void clickHelp(){
        help.click();
    }
    @FindBy(xpath = "//span[@id='glow-ingress-line1']")
    public static WebElement deliverto;

    public void clickDeliverTo(){
        deliverto.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Birthdays')]" )
    public static WebElement birthday;

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



}
