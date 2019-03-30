package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends MainAPI {

    @FindBy(xpath = "//input[@placeholder='Search']")
    public static WebElement searchBox;

    public String clickSearchBox(){
      searchBox.click();
      String text = driver.getTitle();
      return text;
    }

    @FindBy(xpath = "//a[@id='cart']")
    WebElement cart;

    public String clickCart() {
        cart.click();
        String text = cart.getText();
        return text;
    }

    @FindBy(xpath = "//nav[@id='headerMain']//a[@id='account']")
    WebElement signIn;
    public String clickSignIn(){
        signIn.click();
        String text = signIn.getText();
        return text;
    }

    @FindBy(xpath = "//a[@id='trending']")
    WebElement treading;
    public String clickTreading(){
        treading.click();
        String text = treading.getText();
        return text;
    }

    @FindBy (xpath = "//a[@id='secondary']")
    WebElement deals;
    public String clickDeals(){
        deals.click();
        String text = deals.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Find Stores')]")
    WebElement findStore;
    public String clickFindStore (){
        findStore.click();
        String text =findStore.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Gift Cards')]")
    WebElement targetGiftCard;
    public String clickTargetGiftCard(){
        targetGiftCard.click();
        String text = targetGiftCard.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Weekly Ad')]")
    WebElement weeklyAd;
    public String clickWeeklyAd(){
        weeklyAd.click();
        String text = weeklyAd.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Registries & Lists')]")
    WebElement registriesLists;
    public String clickRegistriesList(){
        registriesLists.click();
        String text = registriesLists.getText();
        return text;
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Orders')]")
    WebElement order;
    public String clickOrder(){
        order.click();
        String text = order.getText();
        return text;
    }
}







