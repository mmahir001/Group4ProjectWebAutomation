package testPages;

import base.MainAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchBox;

public class TestSearchBox extends MainAPI {
    SearchBox sb;
    @BeforeMethod
    public void initialize() {
        sb = PageFactory.initElements(driver, SearchBox.class);
    }
        @Test
        public void search () {
            sb.searchItems();
        }

    }
