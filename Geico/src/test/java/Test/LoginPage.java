package Test;

import base.MainAPI;
import homePage.HomePage;
import homePage.PopUpHandeler;
import org.testng.annotations.Test;

public class LoginPage extends MainAPI {
    HomePage newHome;
    PopUpHandeler pup;


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
//    @Test
//    public void testPopUp(){
//        pup.popUp();
//    }

}

