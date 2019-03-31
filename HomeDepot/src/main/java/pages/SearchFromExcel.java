package pages;

import base.MainAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
import utility.Readxls;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchFromExcel extends MainAPI {
    @FindBy(xpath = "//input[@id='headerSearch']")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@class='SearchBox__buttonIcon']")
    public static WebElement searchButton;

    Readxls xlData = new Readxls("C:\\Users\\mdths\\IdeaProjects\\Group4ProjectWebAutomation\\HomeDepot\\lib\\homedepot.xlsx");
    public List expectedWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("Sheet1","Credit Services",i));
        }
        System.out.println(expect);
        return expect;
    }

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
        List<String> list = expectedWebElement();
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


//    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
//        List<String> itemList = expectedWebElement();
//        for(String st: itemList) {
//            getSearchInputField().sendKeys(st, Keys.ENTER);
//            getSearchInputField().clear();
//
//        }
//    }

}
