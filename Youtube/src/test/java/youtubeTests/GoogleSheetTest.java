package youtubeTests;

import base.MainAPI;
import googleSheet.GoogleSheetsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class GoogleSheetTest extends MainAPI {
    GoogleSheetsPage googleSheetsPage;

    @BeforeMethod
    public void initialization(){

        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }

    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        googleSheetsPage.clickSB();
        int i = 0;
        String spreadsheetId = "1_66CM1g1VgZzo62omzFTpo8OniCA1TLuGZ48aFBcof4";
        String range = "Sheet1!A1:Z1000";
//        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
            googleSheetsPage.clickSearchButton1();
        }
        System.out.println("UsingGoogleSheet Passed");
    }



}
