package base;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class Home extends MainAPI {

    @FindBy(xpath = "//input[@placeholder='Search']")
    public static WebElement searchBox;

    public String clickSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.click();
        String text = driver.getTitle();
        return text;
    }

    @FindBy(xpath = "//a[@id='cart']")
    WebElement cart;

    public String clickCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cart.click();
        String text = cart.getText();
        return text;
    }

    @FindBy(xpath = "//nav[@id='headerMain']//a[@id='account']")
    WebElement signIn;

    public String clickSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.click();
        String text = signIn.getText();
        return text;
    }

    @FindBy(xpath = "//a[@id='trending']")
    WebElement treading;

    public String clickTreading(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        treading.click();
        String text = treading.getText();
        return text;
    }

    @FindBy (xpath = "//a[@id='secondary']")
    WebElement deals;

    public String clickDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deals.click();
        String text = deals.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Find Stores')]")
    WebElement findStore;

    public String clickFindStore (){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        findStore.click();
        String text =findStore.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Gift Cards')]")
    WebElement targetGiftCard;

    public String clickTargetGiftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        targetGiftCard.click();
        String text = targetGiftCard.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Weekly Ad')]")
    WebElement weeklyAd;

    public String clickWeeklyAd(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        weeklyAd.click();
        String text = weeklyAd.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Registries & Lists')]")
    WebElement registriesLists;

    public String clickRegistriesList(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registriesLists.click();
        String text = registriesLists.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Orders')]")
    WebElement order;

    public String clickOrder(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        order.click();
        String text = order.getText();
        return text;
    }
}







