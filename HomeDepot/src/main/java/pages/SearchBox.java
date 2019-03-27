package pages;

import base.MainAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchBox extends MainAPI  {


    public void searchIFrames(){
        MainAPI.typeOnElementNEnter("#headerSearch","Frames");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Search Results for Frames at The Home Depot");
    }
    public void searchClocks(){
        MainAPI.typeOnElementNEnter("#headerSearch","Clocks");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Search Results for Clocks at The Home Depot");
    }
    public void searchVases(){
        MainAPI.typeOnElementNEnter("#headerSearch","Vases");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Search Results for Vases at The Home Depot");
    }
    public void searchGames(){
        MainAPI.typeOnElementNEnter("#headerSearch","Games");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Search Results for Games at The Home Depot");
    }
    public void searchMirrors(){
        MainAPI.typeOnElementNEnter("#headerSearch","Mirrors");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Search Results for Gloves at The Home Depot");
    }public void searchGlobes(){
        MainAPI.typeOnElementNEnter("#headerSearch","Gloves");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Search Results for Wallart at The Home Depot");
    }public void searchWallArt(){
        MainAPI.typeOnElementNEnter("#headerSearch","Wallart");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Mirrors - Home Decor - The Home Depot");
    }





}
