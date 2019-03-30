package testPages;

import base.MainAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchBox;
import reporting.TestLogger;

public class TestSearchBox extends MainAPI {
    SearchBox sb;
    @BeforeMethod
    public void initialize() {
        sb = PageFactory.initElements(driver, SearchBox.class);
    }
    @Test
    public void search () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            sb.searchIFrames();
    }
    @Test
    public void search2 () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sb.searchClocks();
    }
    @Test
    public void search3 () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sb.searchVases();
    }
    @Test
    public void search4 () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sb.searchIFrames();
    }
    @Test
    public void search5 () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sb.searchGames();
    }
    @Test
    public void search6 () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sb.searchGlobes();
    }
    @Test
    public void search7 () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sb.searchWallArt();
    }
    @Test
    public void search8 () {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sb.searchMirrors();
    }











}
