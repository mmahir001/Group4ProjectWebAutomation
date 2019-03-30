package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends MainAPI {


    @FindBy(id = "#account")
    WebElement clickSignIn1;

    @FindBy(css = ".Row-uds8za-0 kjjHUt")
    WebElement clickSignIn2;

    @FindBy(id = "#username")
    WebElement enterEmailAddress;

    @FindBy(id = "#password")
    WebElement enterPassword;

    @FindBy(css = ".sc-TOsTZ cpnEzn")
    WebElement clickKeepSignedButton;

    @FindBy(id = "#id=\"login\"")
     WebElement clicksSgnInSubmit;

    public void loginMyAccount(){
        clickSignIn1.click();
        clickSignIn2.click();
        enterEmailAddress.sendKeys("nancy@gmail.com");
        enterPassword.sendKeys("abcd1234");
        clickKeepSignedButton.click();
        clicksSgnInSubmit.click();
    }

    public void loginMyAccountWrongEmail(){
        clickSignIn1.click();
        clickSignIn2.click();
        enterEmailAddress.sendKeys("nancy");
        System.out.println("Email Address in not valid");
        enterPassword.sendKeys("adcf125");
        clickKeepSignedButton.click();
        clicksSgnInSubmit.click();
    }
    public void loginMyAccountWithoutEmail() {
        clickSignIn1.click();
        clickSignIn2.click();
        enterEmailAddress.sendKeys("");
        enterPassword.sendKeys("adcf125");
        clickKeepSignedButton.click();
        clicksSgnInSubmit.click();
        System.out.println("Please Enter the Email Address");
    }
    public void loginMyAccountWithoutPasssword() {
        clickSignIn1.click();
        clickSignIn2.click();
        enterEmailAddress.sendKeys("nancy@gmail.com");
        enterPassword.sendKeys("");
        clickKeepSignedButton.click();
        clicksSgnInSubmit.click();
        System.out.println("Please Enter the Password");
    }
    public void loginMyAccountWithoutEmailPasssword() {
        clickSignIn1.click();
        clickSignIn2.click();
        enterEmailAddress.sendKeys("");
        enterPassword.sendKeys("");
        clickKeepSignedButton.click();
        clicksSgnInSubmit.click();
        System.out.println("YOU must have to Enter the Email and Password to Login");
    }



}




