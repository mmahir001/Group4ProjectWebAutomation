package databaseSearch;

import base.MainAPI;
import databases.ConnectToSqlDB;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class DbSearch extends MainAPI {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "search", "items");
    }
    public static List<String> getHeaderValue() {
        List<String> search = new ArrayList<>();
        search.add("Dolls");
        search.add("Flowers");
        search.add("Pillows");
        search.add("Boys Shoes");
        search.add("Water Bottles");
        search.add("Photo Frames");
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

