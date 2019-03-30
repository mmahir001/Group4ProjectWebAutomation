package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Databasedepot;
import reporting.TestLogger;

import java.util.List;

public class TestDatabasedepo extends MainAPI {

    Databasedepot db;
    @BeforeMethod
    public void intializedElements(){
        db = PageFactory.initElements(driver, Databasedepot.class);

    }
    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
 //        List actual = db.
//        List expected = d
//        Assert.assertEquals(actual,expected);
//
//    }
    }

}
