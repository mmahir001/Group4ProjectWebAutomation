package pages;

import base.MainAPI;

public class Login extends MainAPI {

    public void clickMyAccount() {
        MainAPI.clickOnElem("#headerMyAccountTitle");
    }
    public void clickLogin(){
        MainAPI.clickOnElem(".bttn__content");
    }
    public void enterEmailId(){
        MainAPI.typeOnElementNEnter(".form-input body__m-top-small form-input--error","mtsharif92@gmail.com");
    }



}
