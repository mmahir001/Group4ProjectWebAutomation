package Test;

import base.MainAPI;
import homePage.HomePage;
import org.testng.annotations.Test;

public class LoginPage extends HomePage {
    HomePage newHome;


    @Test
    public void title(){
        String title = driver.getTitle();

        driver.getTitle();
        System.out.println(title);
    }
    @Test
    public void testStartQuote(){
        newHome.startQuote();

    }
    @Test
    public void testPopUp(){
    }

}

