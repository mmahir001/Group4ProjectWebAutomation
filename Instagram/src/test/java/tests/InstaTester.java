package tests;

import base.MainAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InstaTester extends MainAPI {
    @Test
    public void title(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Instagram");
    }
}
