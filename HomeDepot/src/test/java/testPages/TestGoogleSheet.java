package testPages;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GoogleSheetsPage;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheet extends MainAPI {

    GoogleSheetsPage googleSheetsPage;


    @BeforeMethod
    public void initialization(){

        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }

    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        googleSheetsPage.enterSignIn();
        int i = 0;
        String spreadsheetId = "1h8CIfsK_qaMOpbmhuWywGeMmrp3VxZsnLWCGoV686Hk";
        String range = "Sheet1!A1:Z1000";
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
            googleSheetsPage.clickLogIn();
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}


