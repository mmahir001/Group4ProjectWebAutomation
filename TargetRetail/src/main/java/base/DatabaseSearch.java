package base;


import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.util.List;

import javax.xml.xpath.XPath;
import java.util.ArrayList;

public class DatabaseSearch extends MainAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDAtaIntoDB() {
        List<String> list = getHeadredValue();
        ConnectToSqlDB connectToSqlDatabase =new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"search","items");

    }

    public static List<String>getHeadredValue(){
        List<String>search = new ArrayList<>();
        search.add("Cart");
        search.add("Sign In");
        search.add("Treading");
        search.add("Deals");
        search.add("Find Store");
        search.add("Target Gift Card");
        search.add("TWeekly Ad");
        search.add("Registries List");
        search.add("Order");
        return search;
    }

    public List<String> getUserDatafromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("search", "items");
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) throws Exception {
        insertDAtaIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("search", "items");
        for (String st : list) {
            System.out.println(st);
        }
    }
}



