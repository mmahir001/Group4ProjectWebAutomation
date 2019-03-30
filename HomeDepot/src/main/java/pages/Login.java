package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends MainAPI {

    @FindBy(xpath = "//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]")
    WebElement clickMyAccount;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement clickSignIn;
    @FindBy(xpath = "//div[@class='tab--selected']")
    WebElement SignInButton;
    @FindBy(xpath = "//div[@class='login-popup__model']//input[@id='email_id']")
    WebElement enterEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement enterPassword;
    @FindBy(xpath = "//span[@class='bttn__content'][contains(text(),'Sign In')]")
    WebElement clickSignInButton;

    public void loginMyAccount(){
        clickMyAccount.click();
        clickSignIn.click();
        SignInButton.click();
        enterEmail.sendKeys("mtsharif@gmail.com");
        enterPassword.sendKeys("adcf125");
        clickSignInButton.click();
    }
    public void loginMyAccountWrongEmail(){
        clickMyAccount.click();
        clickSignIn.click();
        SignInButton.click();
        enterEmail.sendKeys("mtsharif");
        System.out.println("Email Address in not valid");
        enterPassword.sendKeys("adcf125");
        clickSignInButton.click();
    }
    public void loginMyAccountWithoutEmail() {
        clickMyAccount.click();
        clickSignIn.click();
        SignInButton.click();
        enterEmail.sendKeys("");
        enterPassword.sendKeys("adcf125");
        clickSignInButton.click();
        System.out.println("Please Enter the Email Address");
    }
    public void loginMyAccountWithoutPasssword() {
        clickMyAccount.click();
        clickSignIn.click();
        SignInButton.click();
        enterEmail.sendKeys("mtsharif@gmail.com");
        enterPassword.sendKeys("");
        clickSignInButton.click();
        System.out.println("Please Enter the Password");
    }
    public void loginMyAccountWithoutEmailPasssword() {
        clickMyAccount.click();
        clickSignIn.click();
        SignInButton.click();
        enterEmail.sendKeys("");
        enterPassword.sendKeys("");
        clickSignInButton.click();
        System.out.println("YOU must have to Enter the Email and Password to Login");
    }


}
