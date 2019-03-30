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
        String actual = signUpPage.ClickSignUp();
        String expected = "Sign up";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickLogIn(){
        String actual = signUpPage.ClickLogin();
        String expected = "Log in";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickAboutUs(){
        String actual = signUpPage.ClickAboutUs();
        String expected = "ABOUT US";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickSupport(){
        signUpPage.ClickSupport();

    }

    @Test
    public void ClickPress(){
        String actual = signUpPage.ClickPress();
        String expected = "WordPress.com VIP";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickAPI(){
        String actual = signUpPage.ClickAPI();
        String expected = "API Endpoints";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickJobs(){
        String actual = signUpPage.ClickJobs();
        String expected = "Jobs";
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void ClickPrivacy(){
        String actual = signUpPage.ClickPrivacy();
        String expected = "Privacy and Safety Center";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickTerms(){
        signUpPage.ClickTerms();

    }

    @Test
    public void ClickDirectory(){
        String actual = signUpPage.ClickDirectory();
        String expected = "DIRECTORY";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickProfiles(){
        String actual = signUpPage.ClickProfiles();
        String expected = "PROFILES";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickHashtags(){
        String actual = signUpPage.ClickHashtags();
        String expected = "HASHTAGS";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ClickLanguage(){
        signUpPage.ClickLanguage();

    }
}
