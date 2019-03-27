package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends MainAPI {
    public void title() {

        String st =driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(st,"The Home Depot");
    }
    @FindBy (className = "MyStore__label")
    public static WebElement myStore;

    public void clickMyStore(){
        myStore.click();
    }

    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Store Finder')]")
    public static WebElement storeFinder;

    public void clickStoreFinder(){
        storeFinder.click();
    }
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Truck & Tool Rental')]")
    public static WebElement truckToolRent;

    public void clickTruckToolRent(){
        truckToolRent.click();
    }
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'For the Pro')]")
    public static WebElement forThePro;

    public void clickFotThePro(){
        forThePro.click();
    }
    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Gift Cards')]")
    public static WebElement giftCard;

    public void clickGiftCard(){
        giftCard.click();
    }
    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")
    public static WebElement creditServices;

    public void clickCreditServices(){
        creditServices.click();
    }
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Favorites')]")
    public static WebElement favorites;

    public void clickFavorites(){
        favorites.click();
    }
    @FindBy (xpath = "//a[@id='headerOrderStatus']")
    public static WebElement trackOrder;

    public void clickTrackOrder(){
        trackOrder.click();
    }


}
