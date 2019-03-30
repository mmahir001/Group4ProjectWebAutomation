package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomeDecorFurniture extends MainAPI {

    @FindBy(xpath = "//a[contains(text(),'Home Decor & Furniture')]")
    WebElement homeDecorOutdoor;
    @FindBy(xpath = "//a[@id='home-decor'][contains(text(),'Home Decor')]")
    WebElement homeDecor;
    @FindBy(xpath = "//a[contains(text(),'Wall Accents')]")
    WebElement wallAccents;
    @FindBy(xpath = "//a[@id='furniture'][contains(text(),'Furniture')]")
    WebElement furniture;
    @FindBy(xpath = "//a[contains(text(),'Dining Chairs')]")
    WebElement diningChairs;
    @FindBy(xpath = "//a[@id='kitchen-and-dining'][contains(text(),'Kitchen & Dining')]")
    WebElement kitchenDining;
    @FindBy(xpath = "//a[@id='bedding-and-bath'][contains(text(),'Bedding & Bath')]")
    WebElement beddingBath;
    @FindBy(xpath = "//a[@id='lighting']")
    WebElement lighting;
    @FindBy(xpath = "//a[@id='window-treatments']")
    WebElement windowTreatment;
    @FindBy(xpath = "//a[@id='shop-by-room']")
    WebElement shopByRoom;
    @FindBy(xpath = "//a[@id='savings']")
    WebElement saving;
    @FindBy(xpath = "//a[contains(text(),'Cookware Sets')]")
    WebElement cookwareSets;
    @FindBy(xpath = "//a[@class='homeDecorFurniture__endpoint'][contains(text(),'Bath Towels')]")
    WebElement bathTowels;

    public String clickBeddingBath(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeDecorOutdoor.click();
        beddingBath.click();
        //String text = beddingBath.getText();
        String text = driver.getTitle();
        return text;
    }
    public String clickLighting(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeDecorOutdoor.click();
        lighting.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickshopByRoom(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeDecorOutdoor.click();
        shopByRoom.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickSaving(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeDecorOutdoor.click();
        saving.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickHomeDecor(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(homeDecor).click();
        String text =homeDecor.getText();
        return text;
    }
    public String clickWindowTreatment(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeDecorOutdoor.click();
        windowTreatment.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickKitchenDining() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(kitchenDining).click();
        String text = kitchenDining.getText();
        return text;
    }
    public String HoverOverWallAccents(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(homeDecor).perform();
        action.moveToElement(wallAccents).click();
        String text =wallAccents.getText();
        return text;
    }
    public String HoverOverFurniture(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(furniture).click();
        String text =furniture.getText();
        return  text;
    }
    public String HoverOverDiningChairs() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(furniture).perform();
        action.moveToElement(diningChairs).click();
        String text = diningChairs.getText();
        return text;
    }
    public String HoverOverCookwareSets(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).perform();
        action.moveToElement(kitchenDining).perform();
        action.moveToElement(cookwareSets).click();
        String text = cookwareSets.getText();
        return text;
    }
    public String HoverOverCottonBlanket(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(beddingBath).perform();
        action.moveToElement(bathTowels).click();
        String text = driver.getTitle();
        return text;
    }
}
