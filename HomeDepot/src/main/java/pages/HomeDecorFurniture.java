package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomeDecorFurniture extends MainAPI {

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
    @FindBy(xpath = "//a[@id='kitchen-and-dining'][contains(text(),'Kitchen & Dining')]")
    public static WebElement kitchenDining;

    public String clickKitchenDining(){
        homeDecorOutdoor.click();
        kitchenDining.click();
        String text = driver.getTitle();
        return text;
    }
    @FindBy(xpath = "//div[@class='homeDecorFurniture__bayName']//a[@class='homeDecorFurniture__endpoint'][contains(text(),'Cookware')]")
    public static WebElement cookware;
}
