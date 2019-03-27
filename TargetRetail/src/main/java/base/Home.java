package base;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home extends MainAPI {

    @FindBy(css = "#search")
    WebElement searchBox;

    @FindBy(css = "#account")
    WebElement signIn;

    @FindBy(xpath = "//span[contains(text(),'Categories')]")
    WebElement Categories;

    @FindBy (xpath = "//a[@id='secondary']")
    public static WebElement deals;
    public void clickDeals(){
        deals.click();
    }
    @FindBy(xpath = "//a[@id='cart']")
    WebElement cart;

    @FindBy(css = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Find Stores')]")
    WebElement findStore;


    @FindBy(xpath = "//span[contains(text(),'All about the comfort(er)')]")
    WebElement comforter;

    @FindBy(xpath = "//span[contains(text(),'Baby Bedding')]")
    WebElement babyBedding;

    @FindBy(xpath = "//div[@data-component='COMPONENT-161998']//img[1]")
    WebElement TargetGiftCard;


    public void findAStore() {
        findStore.click();
    }

    public void signInPage() {
        signIn.click();
    }

    public void categories() {
        Categories.click();
    }

    public void deals() {
        deals.click();
    }

    public void cart() {
        cart.click();
    }

    public void enterInSearchBox(String search) {

        searchBox.sendKeys();
    }

    public void clickInCategories() {
        comforter.click();
    }

    public void babyBedding() {
        babyBedding.click();
    }

    public void targetGiftCard() {
        targetGiftCard();

    }
}







