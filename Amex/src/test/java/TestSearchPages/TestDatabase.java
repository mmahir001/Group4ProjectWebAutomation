package TestSearchPages;

import SearchPages.DatabaseConnect;
import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestDatabase extends MainAPI {
    DatabaseConnect dc;
    @BeforeMethod
    public void intializedElements(){
        dc = PageFactory.initElements(driver, DatabaseConnect.class);

    }
    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List actual = dc.getUserDatafromDB();
        List expected = dc.getHeadersValue1();
        Assert.assertEquals(actual,expected);

    }
}
