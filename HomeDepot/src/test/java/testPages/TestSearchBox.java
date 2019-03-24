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
            sb.searchIFrames();
    }
    @Test
    public void search2 () {
        sb.searchClocks();
    }
    @Test
    public void search3 () {
        sb.searchVases();
    }
    @Test
    public void search4 () {
        sb.searchIFrames();
    }
    @Test
    public void search5 () {
        sb.searchGames();
    }
    @Test
    public void search6 () {
        sb.searchGlobes();
    }
    @Test
    public void search7 () {
        sb.searchWallArt();
    }
    @Test
    public void search8 () {
        sb.searchMirrors();
    }










}
