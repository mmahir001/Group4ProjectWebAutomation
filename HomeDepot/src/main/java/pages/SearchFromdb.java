package pages;

import base.MainAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchFromdb extends MainAPI {

   // Databasedepot db = new Databasedepot();
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "search1", "items");
    }
    public static List<String> getHeaderValue() {
        List<String> search = new ArrayList<>();
        search.add("Frames");
        search.add("Clocks");
        search.add("Vases");
        search.add("Games");
        search.add("Mirrors");
        search.add("Wall art");
        return search;
    }
    public List<String> getUserDatafromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("search1", "items");
        System.out.println(list);
        return list;
    }
    @FindBy(xpath = "//input[@id='headerSearch']")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@class='SearchBox__buttonIcon']")
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
        List<String> list = getUserDatafromDB();
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

    public WebElement getSearchInputField() {
        return searchBox;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchBox = searchInputField;
    }

    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> itemList = getUserDatafromDB();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
            //validate items
        }
    }
    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("search1", "items");
        for (String st : list) {
            System.out.println(st);
        }
    }
}
