package pages;

import base.MainAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends MainAPI {
    public void title() {

        String st =driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(st,"The Home Depot");
    }
    public void myStore(){
        MainAPI.clickOnElem(".MyStore__label");
    }
    public void checkCart(){
        MainAPI.clickOnElem(".MyCart__label");
    }

}
