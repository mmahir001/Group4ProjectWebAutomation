package searchDB;

import base.MainAPI;
import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchPageData {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB(){
        List<String> list = lookUpValues();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"SearchList","LookUpNames");
    }

    public static List<String> lookUpValues(){
        List<String> searchValues = new ArrayList<String>();
        searchValues.add("Music");
        searchValues.add("Fortnite");
        searchValues.add("Minecraft");
        searchValues.add("Bollywood movies");
        searchValues.add("Worldcup 2018");
        searchValues.add("More life by drake");
        searchValues.add("Never gona give you up by rick astley");

        return searchValues;
    }

    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("SearchList", "LookUpNames");
        return list;
    }

    public static void main(String[] args)throws Exception, IOException, SQLException, ClassNotFoundException {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("SearchList","LookUpNames");
        for(String st:list){
            System.out.println(st);
        }

    }
}
