package base;

import databaseSearch.DbSearch;
import databaseSearch.SearchExcel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchUsingDb extends MainAPI {

   DbSearch db = new DbSearch();
   SearchExcel se = new SearchExcel();

    @FindBy(xpath = "//input[@id='search']")
    public static WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement searchButton;

    public WebElement getSearchInputWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchBox;
    }
    public WebElement getSubmitButtonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchButton;
    }
    public void searchFor(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ value);
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = db.getUserDatafromDB();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            itemFoundOnSearch(list.get(i));
            clearInput();
        }
    }
    public void itemFoundOnSearch(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" "+ value);
        Assert.assertEquals(value,value);
    }


    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException  {
        List<String> list = se.expectedWebElement();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            Thread.sleep(2000);
            clearInput();
        }
    }


}