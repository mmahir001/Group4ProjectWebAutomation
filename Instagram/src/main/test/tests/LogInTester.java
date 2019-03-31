package tests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;

public class LogInTester extends MainAPI {
    LogInPage logInPage;

    @BeforeMethod
    public void initialize(){
        logInPage = PageFactory.initElements(driver, LogInPage.class);
    }
    @Test
    public void ClickLogIn()throws Exception{
    logInPage.ClickLoginKey();
        }
}


