package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends MainAPI {

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    public static WebElement LoginButton;

   // public void ClickLogin(){LoginButton.click();}

    @FindBy(xpath = "//input[@id='f17d97b343e1604']")
    public static WebElement UserName;

    //public void enterUserName(String enterUsername) {UserName.sendKeys(enterUsername);}

    @FindBy(xpath = "//input[@id='f1b34e7065d004c']")
    public static WebElement Password;

//    public void enterPassword(String enterPassword) {
//        Password.sendKeys(enterPassword);}

    @FindBy(xpath = "//body//div[4]")
    public static WebElement LoginKey;

    public void ClickLoginKey(){
        LoginButton.click();
        UserName.sendKeys("mahirrr.m");
        Password.sendKeys("M@isha0252");
        LoginKey.click();}
}

