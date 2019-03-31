package DatabaseTest;

import Databases.ConnectDB;
import HomePage.HomePage;
import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class ConnectDataBase extends MainAPI {
ConnectDB connectDB;
    HomePage HomePage;
    @BeforeMethod
    public void setUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HomePage = PageFactory.initElements(driver, HomePage.class);
      //  setUrl("http://www.Netflix.com");
        connectDB = PageFactory.initElements(driver, ConnectDB.class); }
    @Test
    public void webElementName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List actual = connectDB.getUserDatafromDB();
        List expected = connectDB.getFooterValue1();
        Assert.assertEquals(actual, expected);
    }
}
