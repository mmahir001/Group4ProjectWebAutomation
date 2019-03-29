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
    @FindBy(xpath = "//a[contains(text(),'Wall Accents')]")
    public static WebElement wallAccents;
    @FindBy(xpath = "//a[@id='furniture'][contains(text(),'Furniture')]")
    public static WebElement furniture;
    @FindBy(xpath = "//a[contains(text(),'Dining Chairs')]")
    WebElement diningChairs;
    @FindBy(xpath = "//a[@id='kitchen-and-dining'][contains(text(),'Kitchen & Dining')]")
    public static WebElement kitchenDining;
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



    public String clickBeddingBath(){
        homeDecorOutdoor.click();
        beddingBath.click();
        //String text = beddingBath.getText();
        String text = driver.getTitle();
        return text;
    }
    public String clickLighting(){
        homeDecorOutdoor.click();
        lighting.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickshopByRoom(){
        homeDecorOutdoor.click();
        shopByRoom.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickSaving(){
        homeDecorOutdoor.click();
        saving.click();
        String text = driver.getTitle();
        return text;
    }

    public String clickHomeDecor(){
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(homeDecor).click();
        String text =homeDecor.getText();
        return text;
    }
    public String clickWindowTreatment(){
        homeDecorOutdoor.click();
        windowTreatment.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickKitchenDining() {
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(kitchenDining).click();
        String text = kitchenDining.getText();
        return text;
    }

    public String HoverOverWallAccents(){
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(homeDecor).perform();
        action.moveToElement(wallAccents).click();
        String text =wallAccents.getText();
        return text;
    }
    public String HoverOverFurniture(){
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(furniture).click();
        String text =furniture.getText();
        return  text;
    }
    public String HoverOverDiningChairs() {
        Actions action = new Actions(driver);
        action.moveToElement(homeDecorOutdoor).click().perform();
        action.moveToElement(furniture).perform();
        action.moveToElement(diningChairs).click();
        String text = diningChairs.getText();
        return text;
    }



    @FindBy(xpath = "//div[@class='homeDecorFurniture__bayName']//a[@class='homeDecorFurniture__endpoint'][contains(text(),'Cookware')]")
    public static WebElement cookware;
}
