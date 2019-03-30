package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchFromdb;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchFromDb extends MainAPI {
    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchFromdb searchPage = PageFactory.initElements(driver, SearchFromdb.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
