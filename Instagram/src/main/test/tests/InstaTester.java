package tests;

import base.MainAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class InstaTester extends MainAPI {
    SignUpPage signUpPage;


    @BeforeMethod
   public void initilizeSignUpPage(){
       signUpPage = PageFactory.initElements(driver, SignUpPage.class);
   }
    @Test
    public void VerifyTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Instagram");
    }

    @Test
    public void EnterEmailOrPhone(){
        signUpPage.insertEmail("mahirmuhtasim@mybihs.org");

    }

    @Test
    public void EnterFullName(){
       signUpPage.insertName("Muhtasim Mahir");
    }

    @Test
    public void EnterUsername(){
        signUpPage.insertUserName("mmahi001");
    }

    @Test
    public void EnterPassword(){
        signUpPage.insertPassword("mahir1234");
    }

    @Test
    public void ClickSignUp(){
        signUpPage.ClickSignUp();
    }

    @Test
    public void ClickLogIn(){
        signUpPage.ClickLogin();
    }

    @Test
    public void ClickAboutUs(){
        signUpPage.ClickAboutUs();
    }

    @Test
    public void ClickSupport(){
        signUpPage.ClickSupport();
    }

    @Test
    public void ClickPress(){
        signUpPage.ClickPress();
    }

    @Test
    public void ClickAPI(){
        signUpPage.ClickAPI();
    }

    @Test
    public void ClickJobs(){
        signUpPage.ClickJobs();
    }

    @Test
    public void ClickPrivacy(){
        signUpPage.ClickPrivacy();
    }

    @Test
    public void ClickTerms(){
        signUpPage.ClickTerms();
    }

    @Test
    public void ClickDirectory(){
        signUpPage.ClickDirectory();
    }

    @Test
    public void ClickProfiles(){
        signUpPage.ClickProfiles();
    }

    @Test
    public void ClickHashtags(){
        signUpPage.ClickHashtags();
    }

    @Test
    public void ClickLanguage(){
        signUpPage.ClickLanguage();
    }
}
