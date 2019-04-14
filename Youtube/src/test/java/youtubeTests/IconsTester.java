package youtubeTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtubePages.Icons;


public class IconsTester extends MainAPI {
    Icons icons;

    @BeforeMethod
    public void initilize(){
        icons = PageFactory.initElements(driver, Icons.class);
    }

    @Test
    public void TestUpoladIcon(){
        icons.clickUI();
    }

    @Test
    public void TestUpolad(){
        icons.clickUploadButton();
    }

    @Test
    public void TestGoingLive(){
        icons.clickGoLive();
    }

    @Test
    public void TestMI(){
        icons.clickMI();
    }

}
