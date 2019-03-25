package pages;

import base.MainAPI;

public class Login extends MainAPI {

    public void clickMyAccount() {
        MainAPI.clickOnElement("#headerMyAccountTitle");
    }
    public void clickLogin(){
        MainAPI.clickOnElement(".bttn__content");
    }
    public void enterEmailId(){
        MainAPI.typeOnElementNEnter(".form-input body__m-top-small form-input--error","mtsharif92@gmail.com");
    }



}
