package homePageTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FoxHomeTest extends MainAPI {
    FoxHome foxHome;

    @BeforeClass
    public void initNYhome() {
        foxHome = PageFactory.initElements(driver,FoxHome.class);
    }

    @Test
    public void selectMenu() throws Exception{
        foxHome.seeMenu();

    }
}
