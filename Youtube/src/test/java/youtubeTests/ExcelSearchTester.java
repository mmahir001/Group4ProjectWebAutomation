package youtubeTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import youtubePages.SearchUsingDb;

import java.io.IOException;
import java.sql.SQLException;

public class ExcelSearchTester extends MainAPI {
    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchUsingDb searchPage = PageFactory.initElements(driver, SearchUsingDb.class);
        searchPage.searchItemsAndSubmitButtonFromExcelFile();
    }
}

