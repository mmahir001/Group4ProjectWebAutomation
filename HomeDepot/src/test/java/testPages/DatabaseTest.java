package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Databasedepot;
import reporting.TestLogger;


import java.lang.management.MemoryManagerMXBean;
import java.util.List;

public class DatabaseTest extends MainAPI {
    Databasedepot databasedepot;
    @BeforeMethod
    public void intializedElements(){
        databasedepot = PageFactory.initElements(driver, Databasedepot.class);

    }
    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List <String> actual = databasedepot.getUserDatafromDB();
        List expected = databasedepot.getHeadersValue1();
        Assert.assertEquals(actual,expected);

    }
}
