package pages;

import base.MainAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SearchBox extends MainAPI {

    @Test
    public void searchItems(){
        MainAPI.typeOnElementNEnter("#headerSearch","Frames");

    }

}
