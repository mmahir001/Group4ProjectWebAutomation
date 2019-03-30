package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllDepartments;
import reporting.TestLogger;

public class TestAllDepartments extends MainAPI {
    AllDepartments ad;
    @BeforeMethod
    public void initialize() {
        ad = PageFactory.initElements(driver, AllDepartments.class);
    }

    @Test
    public void testClickAllDepartment(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.clickDd_AllDepartment();
        String expected = "All Departments";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testHoverAppliances(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.clickDd_Appliances();
        String expected = "Appliances at The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void clickElectrical (){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.clickElectrical();
        String expected = "The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testHoverOverapplienceSpecialBuys(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.HoverOverAppliencesSpecialBuys();
        String expected = "Appliance Special Buys";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverbathroomFaucets(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.HoverOverbathroomFaucets();
        String expected = "Bathroom Sink Faucets";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverCustomBlinds(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.HoverOverCustomBlinds();
        String expected = "Custom Blinds";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverBlinds() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.HoverOverBlinds();
        String expected = "Blinds";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testHoverOverWire(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.HoverOverWire();
        String expected = "Wire";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testHoverOverGateKits(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = ad.HoverOverGateKits();
        String expected = "Gate Kits";
        Assert.assertEquals(actual, expected);

    }


}
