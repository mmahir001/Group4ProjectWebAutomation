package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

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

    @FindBy (xpath = "//a[contains(text(),'All Departments')]")
    public static WebElement dd_AllDepartment;

    public String clickDd_AllDepartment(){
        dd_AllDepartment.click();
        String text =dd_AllDepartment.getText();
        return text;
    }
    @FindBy(xpath = "//li[@class='MainFlyout__item']//a[@title='Appliances'][contains(text(),'Appliances')]")
    public static WebElement dd_Appliances;

    public String clickDd_Appliances(){
        dd_AllDepartment.click();
        dd_Appliances.click();
        String text =dd_Appliances.getText();
        return text;
    }

    @FindBy(xpath = "//a[contains(text(),'Home Decor & Furniture')]")
    public static WebElement homeDecorOutdoor;

    @FindBy(xpath = "//a[@id='home-decor'][contains(text(),'Home Decor')]")
    public static WebElement homeDecor;

    public String clickHomeDecor(){
        homeDecorOutdoor.click();
        homeDecor.click();
        String text =driver.getTitle();
        return text;
    }

    @FindBy(xpath = "//a[contains(text(),'Wall Accents')]")
    public static WebElement wallAccents;

    public String clickWallAccents(){

        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(homeDecor).perform();
        //homeDecorOutdoor.click();
        action.moveToElement(wallAccents).click();
        String text =wallAccents.getText();
        return text;
    }
    @FindBy(xpath = "//a[@id='furniture'][contains(text(),'Furniture')]")
    public static WebElement furniture;

    public String clickFurniture(){
        homeDecorOutdoor.click();
        furniture.click();
        String text = driver.getTitle();
        return  text;
    }




}
