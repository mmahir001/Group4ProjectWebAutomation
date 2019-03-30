package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends MainAPI {

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchBox;

    public String clickSearchBox(){
      searchBox.click();
      String text = driver.getTitle();
      return text;
    }

    @FindBy(xpath = "//a[@id='cart']")
    WebElement cart;

    public String clickCart() {
        cart.click();
        String text = driver.getTitle();
        return text;
    }

    @FindBy(xpath = "//nav[@id='headerMain']//a[@id='account']")
    WebElement signIn;
    public void clickSignIn(){
        signIn.click();

    }
    @FindBy(xpath = "//a[@id='trending']")
    WebElement treading;
    public void clickTreading(){
        treading.click();
    }

    @FindBy (xpath = "//a[@id='secondary']")
    WebElement deals;
    public void clickDeals(){
        deals.click();
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Find Stores')]")
    WebElement findStore;
    public void clickFindStore (){
        findStore.click();
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Gift Cards')]")
    WebElement targetGiftCard;
    public void clickTargetGiftCard(){ targetGiftCard.click(); }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Weekly Ad')]")
    WebElement weeklyAd;
    public void clickWeeklyAd(){
        weeklyAd.click();
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Registries & Lists')]")
    WebElement registriesLists;
    public void clickRegistriesList(){
        registriesLists.click();
    }

    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Orders')]")
    WebElement order;
    public void clickOrder(){
        order.click();
    }

}







