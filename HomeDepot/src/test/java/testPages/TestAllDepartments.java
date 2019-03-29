package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllDepartments;
import pages.HomePage;

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
    public void testClickdd_Appliances(){ ;
        String actual = ad.clickDd_Appliances();
        String expected = "Appliances at The Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testdd_applienceSpecialBuys(){
        String actual = ad.dd_AppliencesSpecialBuys();
        String expected = "Appliance Special Buys";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testclickdd_bathroomFaucets(){
        String actual = ad.dd_bathroomFaucets();
        String expected = "Bathroom Sink Faucets";
        Assert.assertEquals(actual,expected);
    }



}
