package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.logging.XMLFormatter;

public class HomePage extends MainAPI {
    public void title() {

        String actual = driver.getTitle();
        System.out.println(driver.getTitle());
        String expected = "The Home Depot";
        Assert.assertEquals(expected, actual);
    }

    @FindBy (xpath = "//span[@class='MyStore__label']")
    public static WebElement myStore;

    public String  clickMyStore(){
        myStore.click();
        String text = driver.getTitle();
        return text;
    }

    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Store Finder')]")
    public static WebElement storeFinder;

    public String clickStoreFinder(){
        storeFinder.click();
        String text =storeFinder.getText();
        return text;
    }

    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Truck & Tool Rental')]")
    public static WebElement truckToolRent;

    public String clickTruckToolRent(){
        truckToolRent.click();
        String text =storeFinder.getText();
        return text;


    }
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'For the Pro')]")
    public static WebElement forThePro;

    public String clickForThePro(){
        forThePro.click();
        String text =forThePro.getText();
        return text;

    }
    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Gift Cards')]")
    public static WebElement giftCard;

    public String clickGiftCard(){
        giftCard.click();
        String text =giftCard.getText();
        return text;
    }
    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")
    public static WebElement creditServices;

    public String clickCreditServices(){
        creditServices.click();
        String text =creditServices.getText();
        return text;
    }
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Favorites')]")
    public static WebElement favorites;

    public String clickFavorites(){
        favorites.click();
        String text =favorites.getText();
        return text;
    }
    @FindBy (xpath = "//a[@id='headerOrderStatus'][contains(text(),'Track Order')]")
    public static WebElement trackOrder;

    public String clickTrackOrder(){
        trackOrder.click();
        String text =trackOrder.getText();
        return text;
    }
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Help')]")
    public static WebElement help;

    public String clickHelp(){
        help.click();
        String text =help.getText();
        return text;
    }

    @FindBy (xpath = "//span[@class='MyCart__label'][contains(text(),'Cart')]")
    public static WebElement myCart;

    public String clickMyCart(){
        myCart.click();
        String text =myCart.getText();
        return text;
    }








}
