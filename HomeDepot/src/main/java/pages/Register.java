package pages;

import base.MainAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.util.ArrayList;
import java.util.List;

public class Register extends MainAPI {


     @FindBy(xpath = "//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]")
    public static WebElement myAccount;

     @FindBy(xpath = "//span[contains(text(),'Register')]")
     public static WebElement clickRegister;

     @FindBy(xpath = "//div[@class='tab--selected']")
     public static WebElement creatAccoutTab;

     @FindBy(xpath = "//div[@class='createAccountModalForm']//input[@id='email_id']")
     public static WebElement typeEmailId;

     @FindBy(xpath = "//input[@id='registrationPassword']")
     public static WebElement typePassword;

     @FindBy(xpath = "//input[@id='zipcode']")
     public static WebElement zipCode;

     @FindBy(xpath = "//input[@id='phoneNumber']")
     public static WebElement phoneNumber;

     @FindBy(xpath = "//div[@id='phoneVerifyCheckboxContainer']//label[@class='checkbox-btn__label']")
     public static WebElement clickCheckBox;
     @FindBy(xpath = "//span[contains(text(),'Create Account')]")
     public static WebElement clickCreatAccount;



     public String clickMyAccount(){
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


}
