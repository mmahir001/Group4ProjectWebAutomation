package googleSheet;

import base.MainAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static GoogleAPI.GoogleSheetReader.getSheetsService;

public class GoogleSheetsPage extends MainAPI {

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchBox;

    public void clickSB() throws InterruptedException{
        sleepFor(2);
        searchBox.click();
    }

    @FindBy(xpath = "//button[@class='style-scope ytd-searchbox']")
    WebElement searchButton;

    public void clickSearchButton1() throws InterruptedException{
        sleepFor(2);
        searchButton.click();
    }

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    // //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(searchBox, row.get(0).toString());
            sleepFor(1);
            clearInputBox(searchBox);
            sleepFor(1);
        }
        return actual;
    }

}
