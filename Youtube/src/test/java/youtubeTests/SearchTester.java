package youtubeTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import youtubePages.SearchPage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchTester extends MainAPI {
    SearchPage sp;
    @BeforeMethod
    public void initializeSearch(){
        sp = PageFactory.initElements(driver, SearchPage.class);
    }
    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException{
        sp.enterAndSearch();





    }
}
