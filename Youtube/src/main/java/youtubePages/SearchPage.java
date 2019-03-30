package youtubePages;

import base.MainAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
import searchDB.SearchPageData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class SearchPage extends MainAPI{
    SearchPageData db = new SearchPageData();

    @FindBy(xpath = "//input[@id='search']")
    public static WebElement searchBox;

    public WebElement inputElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));return searchBox;
    }

    @FindBy(xpath = "//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")
    public static WebElement searchButton;

    public WebElement submitButtonElement(){
        return searchButton;
    }

    public void lookUp(String value){
        inputElement().sendKeys(value);
    }

    public void hitSearch(){
        submitButtonElement().click();
    }

    public void clearSearchBox(){
        inputElement().clear();
    }
    public void enterAndSearch()throws Exception, IOException, SQLException, ClassNotFoundException{

        List<String> list = db.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            lookUp(list.get(i));
            hitSearch();
            searchResult(list.get(i));
            clearSearchBox();
        }
    }
    public void searchResult(String value){

        Assert.assertEquals(value,value);
    }

    public void enterAndSearch (WebDriver driver1)throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = db.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            lookUp(list.get(i));
            hitSearch();
            clearSearchBox();
        }
    }

    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException  {
        // ToDo
        //Read data from Excel file using Apache POI
        List<String> list = null;
        for(int i=0; i<list.size(); i++) {
            lookUp(list.get(i));
            hitSearch();
            clearSearchBox();
        }
    }

    public WebElement getSearchInputField() {
        return searchBox;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchBox = searchInputField;
    }

    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> itemList = db.getItemsListFromDB();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
            //validate items
        }
    }

}
