package pages;

import base.MainAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class Databasedepot extends MainAPI{


    public static class DatabaseOperation {
        public  ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        public  static  void insertDataIntoDB() {
            List<String> list = getHeaderValue();
            ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
            connectToSqlDB.insertDataFromArrayListToSqlTable(list, "search", "items");
        }

        public  static List<String> getHeaderValue() {
            List<String> headerList = new ArrayList<>();
            headerList.add("My Store");
            headerList.add("Gift Cards");
            headerList.add("Truck to Tent");
            headerList.add("Favourites");
            headerList.add("My Cart");
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
        @FindBy(xpath = "//span[@class='MyStore__label']")
        WebElement myStore;

        @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Gift Cards')]")
        WebElement giftCard;
        @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Store Finder')]")
        WebElement storeFinder;
        @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Truck & Tool Rental')]")
        WebElement truckToolRent;
        @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'For the Pro')]")
        WebElement forThePro;
        @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")
        WebElement creditServices;
        @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Favorites')]")
        WebElement favorites;
        @FindBy (xpath = "//a[@id='headerOrderStatus'][contains(text(),'Track Order')]")
        WebElement trackOrder;
        @FindBy (xpath = "//a[@class='TaskLinks__link'][contains(text(),'Help')]")
        WebElement help;
        @FindBy (xpath = "//span[@class='MyCart__label'][contains(text(),'Cart')]")
        WebElement myCart;

//        @FindBy(how = How.CSS, css = "#label-myAccount")
//        WebElement myAccount;
//        @FindBy(css = "#label-cards")
//        WebElement cards;k
//        @FindBy(css = "#label-travel")
//        WebElement travel;
//        @FindBy(css = "#label-rewards")
//        WebElement rewards;
//        @FindBy(css = "#label-business")
//        WebElement business;
//        @FindBy(xpath = "//a[@class='axp-global-header__dls__hiddenSmDown___2bPWN axp-global-header__GlobalHeader__helpLink___XEGy0 axp-global-header__dls__btn___GqzcQ axp-global-header__dls__btnInline___1JW2H axp-global-header__dls__btnSm___3wi1D axp-global-header__dls__btnTertiary___i3wVn axp-global-header__dls__margin1R___1LOzX']")
//        WebElement help;

        public  List getHeadersValue1() {
            TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<WebElement> headerList1 = new ArrayList<>();
            headerList1.add(myStore);
            headerList1.add(giftCard);
            headerList1.add(trackOrder);
            headerList1.add(favorites);
            headerList1.add(myCart);
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
}
