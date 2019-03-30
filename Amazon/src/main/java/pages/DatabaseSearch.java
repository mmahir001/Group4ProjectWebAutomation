package pages;

import base.MainAPI;
import databases.ConnectToSqlDB;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSearch extends MainAPI {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "search", "items");
    }
    public static List<String> getHeaderValue() {
        List<String> search = new ArrayList<>();
        search.add("iPhone");
        search.add("watch");
        search.add("earphone");
        search.add("macbaook");
        search.add("iphone cover");
        search.add("hats");
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
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("search", "items");
        for (String st : list) {
            System.out.println(st);
        }
    }

}
