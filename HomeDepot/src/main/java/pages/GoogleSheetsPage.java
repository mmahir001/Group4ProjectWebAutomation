package pages;

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

public class GoogleSheetsPage extends MainAPI{

    @FindBy(xpath = "//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]")
    WebElement clickMyAccount;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement clickSignIn;
    @FindBy(xpath = "//div[@class='tab--selected']")
    WebElement signInButton;
    @FindBy(xpath = "//div[@class='login-popup__model']//input[@id='email_id']")
    WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//span[@class='bttn__content'][contains(text(),'Sign In')]")
    WebElement clickSignInButton;
    @FindBy(xpath = "//span[@class='alert-inline__tilte']")
    public static WebElement signInErrorMessage;


    public void clickLogIn() throws InterruptedException {
        sleepFor(4);
        clickSignInButton.click();
    }
    public void enterSignIn() throws InterruptedException {
        clickMyAccount.click();
        sleepFor(2);
        clickSignIn.click();
        sleepFor(2);
        signInButton.click();
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
            inputValueInTextBoxByWebElement(email, row.get(0).toString());
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            sleepFor(1);
            actual.add(getTextByWebElement(signInErrorMessage));
            System.out.println(getTextByWebElement(signInErrorMessage));
            clearInputBox(email);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
}
