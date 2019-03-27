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












}
