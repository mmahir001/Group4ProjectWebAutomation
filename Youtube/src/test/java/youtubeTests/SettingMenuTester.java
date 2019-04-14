package youtubeTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtubePages.SettingMenu;
import youtubePages.YTMenu;

public class SettingMenuTester extends MainAPI {
    SettingMenu sm;

    @BeforeMethod
    public void initilizeYT(){
        sm = PageFactory.initElements(driver, SettingMenu.class);
    }

    @Test
    public void TestSI(){
        sm.clickSI();
    }

    @Test
    public void TestDT(){
        sm.clickDT();
    }

    @Test
    public void TestLanguage(){
        sm.clickLanguage();
    }

    @Test
    public void TestSettings(){
        sm.clickSettings();
    }

    @Test
    public void TestHelp(){
        sm.clickHelp();
    }

    @Test
    public void TestFeedback(){
        sm.clickFeedback();
    }

    @Test
    public void TestSC(){
        sm.clickSC();
    }

    @Test
    public void TestLocation(){
        sm.clickLocation();
    }

    @Test
    public void TestMode(){
        sm.clickMode();
    }

}
