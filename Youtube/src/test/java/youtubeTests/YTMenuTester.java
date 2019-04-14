package youtubeTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtubePages.Icons;
import youtubePages.YTMenu;

public class YTMenuTester extends MainAPI {
    YTMenu ytMenu;

    @BeforeMethod
    public void initilizeYT(){
        ytMenu = PageFactory.initElements(driver, YTMenu.class);
    }

    @Test
    public void TestTB(){
        ytMenu.clickTB();
    }

    @Test
    public void TestYTTV(){
        ytMenu.clickYTTV();
    }

    @Test
    public void TestYTMusic(){
        ytMenu.clickYTMusic();
    }

    @Test
    public void TestYTKids(){
        ytMenu.clickYTKids();
    }

    @Test
    public void TestCA(){
        ytMenu.clickCA();
    }

    @Test
    public void TestYTForArtists(){
        ytMenu.clickYTForArtists();
    }
}
