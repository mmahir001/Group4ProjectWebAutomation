package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
import utility.Readxls;
import java.util.ArrayList;
import java.util.List;
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
    @FindBy(xpath = "//a[@data-id='homeServices']")
    WebElement homeService;
    @FindBy(xpath = "//a[@class='list__link diyFlyout__level3link'][contains(text(),'Sheds')]")
    WebElement sheds;
    @FindBy(xpath = "//a[contains(text(),'Carpet')]")
    WebElement carpet;
    @FindBy(xpath = "//a[@class='ShoppingLinks__link'][contains(text(),'Specials & Offers')]")
    WebElement SpecialOfferce;
    @FindBy(xpath = "//a[contains(text(),'Local Ad')]")
    WebElement localAd;
    public String  clickMyStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myStore.click();
        String text = driver.getTitle();
        return text;
    }
    public String clickStoreFinder(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        storeFinder.click();
        String text =storeFinder.getText();
        return text;
    }
    public String clickTruckToolRent(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        truckToolRent.click();
        String text =storeFinder.getText();
        return text;
    }
    public String clickForThePro(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        forThePro.click();
        String text =forThePro.getText();
        return text;
    }
    public String clickGiftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giftCard.click();
        String text =giftCard.getText();
        return text;
    }
    public String clickCreditServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        creditServices.click();
        String text =creditServices.getText();
        return text;
    }

    public String clickFavorites(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        favorites.click();
        String text =favorites.getText();
        return text;
    }

    public String clickTrackOrder(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        trackOrder.click();
        String text =trackOrder.getText();
        return text;
    }

    public String clickHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        help.click();
        String text =help.getText();
        return text;
    }

    public String clickMyCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myCart.click();
        String text =myCart.getText();
        return text;
    }
    public String hoveroversheds(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeService).click().perform();
        action.moveToElement(sheds).click();
        String text = sheds.getText();
        return text;
    }
    public String hoveroverCarpet(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(homeService).click().perform();
        action.moveToElement(carpet).click();
        String text = carpet.getText();
        return text;
    }
    public String clickSpecialOffer(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SpecialOfferce.click();
        String text = SpecialOfferce.getText();
        return text;
    }
    public String clickLocalAd(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        localAd.click();
        String text = localAd.getText();
        return text;
    }

    public List webElementList() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(creditServices);
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
    Readxls xlData = new Readxls("C:\\Users\\mdths\\IdeaProjects\\Group4ProjectWebAutomation\\HomeDepot\\lib\\homedepot.xlsx");
    public List expectedWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("Sheet1","Credit Services",i));
        }
        System.out.println(expect);
        return expect;
    }

}
