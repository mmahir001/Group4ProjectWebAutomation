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
        String expected = "Home Decor";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testClickBeddingBath(){
        String actual = hdf.clickBeddingBath();
        String expected = "Shop Bedding & Bath Decor at The Home Depot";
        Assert.assertEquals (actual,expected);
    }

    @Test
    public void testHoverOverAccents()throws Exception{
        String actual = hdf.HoverOverWallAccents();
        String expected = "Wall Accents";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void testHoverOverFurniture(){
        String actual = hdf.HoverOverFurniture();
        String expected = "Furniture";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverDiningChairs(){
        String actual = hdf.HoverOverDiningChairs();
        String expected = "";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickKitchenDining(){
        String actual = hdf.clickKitchenDining();
        String expected = "Kitchen & Dining";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickLighting(){
        String actual = hdf.clickLighting();
        String expected = "Lighting - The Home Depot";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickWindowTreatment(){
        String actual = hdf.clickWindowTreatment();
        String expected = "Window Treatments - The Home Depot";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickShopByRoom(){
        String actual = hdf.clickshopByRoom();
        String expected = "Explore Styles for Your Home";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testClickSaving(){
        String actual = hdf.clickSaving();
        String expected = "Specials & Offers at The Home Depot";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverCookwareSets(){
        String actual = hdf.HoverOverCookwareSets();
        String expected = "Cookware Sets";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testHoverOverCottonBlanket(){
        String actual = hdf.HoverOverCottonBlanket();
        String expected = "The Home Depot";
        Assert.assertEquals(actual,expected);
    }



}
