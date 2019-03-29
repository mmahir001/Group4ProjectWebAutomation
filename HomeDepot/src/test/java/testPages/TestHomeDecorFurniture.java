package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomeDecorFurniture;
import pages.HomePage;

public class TestHomeDecorFurniture extends MainAPI {
    HomeDecorFurniture hdf;
    @BeforeMethod
    public void initialize() {
        hdf = PageFactory.initElements(driver, HomeDecorFurniture.class);
    }
    @Test
    public void testclickHomeDecor(){
        String actual = hdf.clickHomeDecor();
        String expected = "Shop Home Decor at the Home Depot";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testWallAccents()throws Exception{
        String actual = hdf.clickWallAccents();
        String expected = "Wall Accents";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickFurniture(){
        String actual = hdf.clickFurniture();
        String expected = "Shop Furniture at The Home Depot";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickKitchenDining(){
        String actual = hdf.clickKitchenDining();
        String expected = "Shop Kitchenware at The Home Depot";
        Assert.assertEquals(actual,expected);
    }


}
