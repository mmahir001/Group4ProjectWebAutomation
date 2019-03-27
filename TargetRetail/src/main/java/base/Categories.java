package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Categories extends MainAPI {

   @FindBy (xpath = "//a[@id='secondary']")
   public static WebElement deals;
   public void clickDeals(){
       deals.click();
   }


    @FindBy (xpath = "//span[contains(text(),'Categories')]")
    public static WebElement categories;

    public void clickCtagories(){
        categories.click();
    }
    @FindBy (xpath = "//div[contains(text(),'Categories')]")
    public static WebElement secondcatagories;

    public void clickSecondCtagories(){
        categories.click();
    }

    @FindBy(xpath = "//div[contains(text(),'Women')]")
    public static WebElement women;
    public void clickOnWomensTab() throws Exception {
         women.click();
    }


//    public void hoverOverViewAllTab() throws Exception, InterruptedException{
//        Actions actions = new Actions(driver);
//        actions.moveToElement(women).perform();
//
//    }

    @FindBy(xpath = "//div[contains(text(),'Men')]")
    public static WebElement men;

    public void clickMan(){
        men.click();
    }

    @FindBy (xpath = "//div[contains(text(),'Young Adult')]")
    public static WebElement Young_Adult;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Kids')]")
    public static WebElement Kids;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Baby')]")
    public static WebElement Baby;

    @FindBy (xpath = "//div[contains(text(),'Shoes')]")
    public static WebElement Shoes;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Home')]")
    public static WebElement Home;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Furniture')]")
    public static WebElement Furniture;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Kitchen & Dining')]")
    public static WebElement Kitchen_Dining;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Patio & Garden')]")
    public static WebElement Patio_Garden;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Toys')]")
    public static WebElement Toys;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Electronics')]")
    public static WebElement Electronics;

    @FindBy (xpath = "//div[contains(text(),'Video Games')]")
    public static WebElement Video_Game;

    @FindBy (xpath = "//div[contains(text(),'Movies, Music & Books')]")
    public static WebElement Movies_Music_Books;

    @FindBy (xpath = "//div[contains(text(),'Sports & Outdoors')]")
    public static WebElement Sports_Outdoors;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Beauty')]")
    public static WebElement Beauty;

    @FindBy (xpath = "//div[contains(text(),'Health')]")
    public static WebElement Health;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Household Essentials')]")
    public static WebElement Household_Essentials;

    @FindBy (xpath = "//div[contains(text(),'Pets')]")
    public static WebElement Pets;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Grocery')]")
    public static WebElement Grocery;

    @FindBy (xpath = "//div[contains(text(),'Luggage')]")
    public static WebElement Luggage;

    @FindBy (xpath = "//div[contains(text(),'School & Office Supplies')]")
    public static WebElement School_Office_Supplies;

    @FindBy (xpath = "//div[contains(text(),'Party Supplies')]")
    public static WebElement party_Supplies;

    @FindBy (xpath = "//div[contains(text(),'Party Supplies')]")
    public static WebElement Party_Supplies;

    @FindBy (xpath = "//div[contains(text(),'Musical Instruments')]")
    public static WebElement Musical_Instruments;

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Clearance')]")
    public static WebElement Clearance;
























}
