package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.Readxls;

import java.util.ArrayList;
import java.util.List;

public class UseXlsx extends  MainAPI{

    @FindBy(id = "nav-your-amazon")
    public static WebElement yourAmazonTab;

    @FindBy(xpath = "//a[contains(text(),\"Today's Deals\")]")
    public static WebElement today_deal;

    @FindBy(xpath = "//a[@class='nav-a'][contains(text(),'Gift Cards')]")
    public static WebElement giftCards;

    @FindBy(xpath = "//a[@class='nav-a'][contains(text(),'c')]")
    public static WebElement wholeFoods;


    @FindBy(xpath = "//span[@class='nav-line-2'][contains(text(),'Orders')]")
    public static WebElement orders;

    @FindBy(xpath = "//a[contains(text(),'Registry')]")
    public static WebElement registry;

    @FindBy(xpath = "//span[@class='nav-line-2'][contains(text(),'Try Prime')]")
    WebElement prime;


    @FindBy(xpath = "//span[@id='glow-ingress-line1']")
    public static WebElement deliverto;

    public List webElementList() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> webElements = new ArrayList<>();
        webElements.add();
        webElements.add();
        webElements.add();
        webElements.add();
        webElements.add();
        webElements.add();
        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
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

}
