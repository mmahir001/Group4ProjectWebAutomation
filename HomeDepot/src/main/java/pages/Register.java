package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Register extends MainAPI {


     @FindBy(xpath = "//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]")
     WebElement myAccount;
     @FindBy(xpath = "//span[contains(text(),'Register')]")
     WebElement clickRegister;
     @FindBy(xpath = "//*[@class='tab--selected'][contains(text(),'Create an Account')]")
     WebElement creatAccoutTab;
     @FindBy(xpath = "//div[@class='createAccountModalForm']//input[@id='email_id']")
     WebElement typeEmailId;
     @FindBy(xpath = "//input[@id='registrationPassword']")
     WebElement typePassword;
     @FindBy(xpath = "//input[@id='zipcode']")
     WebElement zipCode;
     @FindBy(xpath = "//input[@id='phoneNumber']")
     WebElement phoneNumber;
     @FindBy(xpath = "//div[@id='phoneVerifyCheckboxContainer']//label[@class='checkbox-btn__label']")
     WebElement clickCheckBox;
     @FindBy(xpath = "//span[contains(text(),'Create Account')]")
     WebElement clickCreatAccount;
     @FindBy(xpath = "//a[@id='headerMyAccountOrders'][contains(text(),'Orders & Purchases')]")
     WebElement orderandPerchases;
     @FindBy(xpath = "//a[@class='MyAccount__link MyAccount__link--creditCard'][contains(text(),'My Credit Card Account')]")
     WebElement myCreditCardAccount;
     @FindBy(xpath = "//a[@title='Account Profile']")
     WebElement accountProfile;
     @FindBy(xpath = "//a[@title='Favorites']")
     WebElement favorites;
     @FindBy(xpath = "//a[@title='Find a List'][contains(text(),'Find a List')]")
     WebElement FindList;
     @FindBy(xpath = "//a[@title='My Subscriptions'][contains(text(),'My Subscriptions')]")
     WebElement mySubsciptions;





     public String createAccount(){
         TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         myAccount.click();
         clickRegister.click();
         creatAccoutTab.click();
         typeEmailId.sendKeys("mtsharif@gmail.com");
         typePassword.sendKeys("abcd1234");
         zipCode.sendKeys("11217");
         phoneNumber.sendKeys("345123543");
         clickCheckBox.click();
         clickCreatAccount.click();
         String text = driver.getTitle();
         return text;
     }
    public String creatAccountwithoutemail(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myAccount.click();
        clickRegister.click();
        creatAccoutTab.click();
        typeEmailId.sendKeys("");
        typePassword.sendKeys("abcd1234");
        zipCode.sendKeys("adchgsf");
        phoneNumber.sendKeys("345123543");
       // clickCheckBox.click();
        clickCreatAccount.click();
        String text = driver.getTitle();
        return text;
    }

    public String clickOrderandPurchases(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myAccount.click();
        orderandPerchases.click();
        String text = orderandPerchases.getText();
        return text;
    }
    public String clickMyCreditCard() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         myAccount.click();
         myCreditCardAccount.click();
         String text = myCreditCardAccount.getText();
         return text;
    }
    public String clickAccountProfile(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         myAccount.click();
         accountProfile.click();
         String text = accountProfile.getText();
         return text;
    }
    public String clickFavorites(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         myAccount.click();
         favorites.click();
         String text = favorites.getText();
         return text;
    }
    public String clickFindList() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         myAccount.click();
         FindList.click();
         String text = FindList.getText();
         return  text;
    }
    public String clickMySubscriptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         myAccount.click();
         mySubsciptions.click();
         String text = mySubsciptions.getText();
         return text;

    }



}
