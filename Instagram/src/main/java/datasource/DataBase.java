package datasource;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"ItemList","items");
    }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }

    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    public static void main(String[] args)throws Exception, IOException, SQLException, ClassNotFoundException {
        //insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("ItemList","items");
        for(String st:list){
            System.out.println(st);
        }

    }
}
