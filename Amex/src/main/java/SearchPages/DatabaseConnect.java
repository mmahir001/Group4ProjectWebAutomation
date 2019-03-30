package SearchPages;

import base.MainAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnect extends MainAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "search", "items");
    }

    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("My Account");
        headerList.add("Cards");
        headerList.add("Travel");
        headerList.add("Rewards");
        headerList.add("Business");
        headerList.add("Help");
        return headerList;
    }

    public List<String> getUserDatafromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("search", "items");
        System.out.println(list);
        return list;

    }

    @FindBy(how = How.CSS, css = "#label-myAccount")
    WebElement myAccount;
    @FindBy(css = "#label-cards")
    WebElement cards;
    @FindBy(css = "#label-travel")
    WebElement travel;
    @FindBy(css = "#label-rewards")
    WebElement rewards;
    @FindBy(css = "#label-business")
    WebElement business;
    @FindBy(xpath = "//a[@class='axp-global-header__dls__hiddenSmDown___2bPWN axp-global-header__GlobalHeader__helpLink___XEGy0 axp-global-header__dls__btn___GqzcQ axp-global-header__dls__btnInline___1JW2H axp-global-header__dls__btnSm___3wi1D axp-global-header__dls__btnTertiary___i3wVn axp-global-header__dls__margin1R___1LOzX']")
    WebElement help;

    public List getHeadersValue1() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(myAccount);
        headerList1.add(cards);
        headerList1.add(travel);
        headerList1.add(rewards);
        headerList1.add(business);
        headerList1.add(help);
        List<String> list = new ArrayList<>();
        for (int i = 0; i<headerList1.size();i++){
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("search", "items");
        for (String st : list) {
            System.out.println(st);
        }
    }
}
