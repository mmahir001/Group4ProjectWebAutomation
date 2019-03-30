package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllDepartments;

public class TestAllDepartments extends MainAPI {
    AllDepartments ad;
    @BeforeMethod
    public void initialize() {
        ad = PageFactory.initElements(driver, AllDepartments.class);
    }

    @Test
    public void testClickAllDepartment(){
        String actual = ad.clickDd_AllDepartment();
        String expected = "All Departments";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testHoverAppliances(){ ;
        String actual = ad.clickDd_Appliances();
        String expected = "Appliances at The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void clickElectrical (){
        String actual = ad.clickElectrical();
        String expected = "The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testHoverOverapplienceSpecialBuys(){
        String actual = ad.HoverOverAppliencesSpecialBuys();
        String expected = "Appliance Special Buys";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverbathroomFaucets(){
        String actual = ad.HoverOverbathroomFaucets();
        String expected = "Bathroom Sink Faucets";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverCustomBlinds(){
        String actual = ad.HoverOverCustomBlinds();
        String expected = "Custom Blinds";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverBlinds() {
        String actual = ad.HoverOverBlinds();
        String expected = "Blinds";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testHoverOverWire(){
        String actual = ad.HoverOverWire();
        String expected = "Wire";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testHoverOverGateKits(){
        String actual = ad.HoverOverGateKits();
        String expected = "Gate Kits";
        Assert.assertEquals(actual, expected);

    }


}
