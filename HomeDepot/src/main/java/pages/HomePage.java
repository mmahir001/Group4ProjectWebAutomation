package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
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

    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Gift Cards')]")
    public static WebElement giftCard;
    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Store Finder')]")
    public static WebElement storeFinder;
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Truck & Tool Rental')]")
    public static WebElement truckToolRent;
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'For the Pro')]")
    public static WebElement forThePro;
    @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")
    public static WebElement creditServices;
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Favorites')]")
    public static WebElement favorites;
    @FindBy (xpath = "//a[@id='headerOrderStatus'][contains(text(),'Track Order')]")
    public static WebElement trackOrder;
    @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Help')]")
    public static WebElement help;
    @FindBy (xpath = "//span[@class='MyCart__label'][contains(text(),'Cart')]")
    public static WebElement myCart;


    public String  clickMyStore(){
        myStore.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickStoreFinder(){
        storeFinder.click();
        String text =storeFinder.getText();
        return text;
    }
    public String clickTruckToolRent(){
        truckToolRent.click();
        String text =storeFinder.getText();
        return text;
    }
    public String clickForThePro(){
        forThePro.click();
        String text =forThePro.getText();
        return text;
    }
    public String clickGiftCard(){
        giftCard.click();
        String text =giftCard.getText();
        return text;
    }
    public String clickCreditServices(){
        creditServices.click();
        String text =creditServices.getText();
        return text;
    }

    public String clickFavorites(){
        favorites.click();
        String text =favorites.getText();
        return text;
    }

    public String clickTrackOrder(){
        trackOrder.click();
        String text =trackOrder.getText();
        return text;
    }

    public String clickHelp(){
        help.click();
        String text =help.getText();
        return text;
    }

    public String clickMyCart(){
        myCart.click();
        String text =myCart.getText();
        return text;
    }


    public List webElementList(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(myStore);
        webElements.add(myCart);
        webElements.add(help);
        webElements.add(favorites);
        webElements.add(forThePro);
        webElements.add(giftCard);
        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    DataReader xlData = new DataReader("C:\\Users\\mdths\\Desktop\\homedepot.xlsx");
    public List expectedWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("Sheet1","ABOUT",i));
        }
        System.out.println(expect);
        return expect;
    }




}
