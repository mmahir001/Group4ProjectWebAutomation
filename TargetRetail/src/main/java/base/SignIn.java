package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends MainAPI {


    @FindBy(id = "#account")
    public static WebElement account;

    @FindBy(css = ".Row-uds8za-0 kjjHUt")
    public static WebElement signIn;

    @FindBy(id = "username")
    public static WebElement emailAddress;

    @FindBy(id = "#password")
    public static WebElement password;

    @FindBy(id = "#login")
    public static WebElement signInSubmit;


    public void signInMyAccount() {
        account.click();
        signIn.click();
    }
    public void invalidAccountSignIn(String email, String pwd) {
        signInMyAccount();
        emailAddress.sendKeys("nancy@gmail.com");
        password.sendKeys("abcd1234");

        }
    }




