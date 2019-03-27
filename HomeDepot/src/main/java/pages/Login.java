package pages;

import base.MainAPI;

public class Login extends MainAPI {

    public void clickMyAccount() {
        MainAPI.clickOnElement("//div[@class='headerMyAccountTitle MyAccount__status hide show--sm']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]");
    }
    public void clickLogin(){

        MainAPI.clickOnElement("//span[contains(text(),'Sign in')]");
    }
    public void enterEmailId(){
        //CSS Locator
        MainAPI.typeOnElementNEnter("#email_id","mtsharif92@gmail.com");
    }
    public void enterPassword(){
        MainAPI.typeOnElementNEnter("//input[@id='password']","abcd12345");
    }
    public void clickSignIn(){
        //CSS Locator
        MainAPI.clickOnElement("//span[@class='bttn__content'][contains(text(),'Sign In')]");
    }

    public void login(){
        clickMyAccount();
        clickLogin();
        enterEmailId();
        enterPassword();
        clickSignIn();

    }



}
