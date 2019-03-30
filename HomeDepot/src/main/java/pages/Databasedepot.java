package pages;

import base.MainAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class Databasedepot extends MainAPI{
        public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        public static void insertDataIntoDB() {
            List<String> list = getHeaderValue();
            ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
            connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "search", "items");
        }
        public static List<String> getHeaderValue() {
            List<String> search = new ArrayList<>();
            search.add("My Store");
            search.add("Gift Cards");
            search.add("Truck Order");
            search.add("Favourites");
            search.add("Cart");
            search.add("Help");
            return search;
        }
        public List<String> getUserDatafromDB() throws Exception {
            TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> list = new ArrayList<>();
            list = connectToSqlDB.readDataBase("search", "items");
            System.out.println(list);
            return list;
        }
        @FindBy(how= How.XPATH, xpath = "//span[@class='MyStore__label']")
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
        public  List getHeadersValue1() {
            TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<WebElement> search = new ArrayList<>();
            search.add(myStore);
            search.add(giftCard);
            search.add(truckToolRent);
            search.add(favorites);
            search.add(myCart);
            search.add(help);
            List<String> list = new ArrayList<>();
            for (int i = 0; i<search.size();i++){
                list.add(search.get(i).getText());
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

