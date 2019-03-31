package databaseSearch;

import base.MainAPI;
import reporting.TestLogger;
import utility.Readxls;

import java.util.ArrayList;
import java.util.List;

public class SearchExcel extends MainAPI {
    Readxls xlData = new Readxls("/Users/nancyrashid/IdeaProjects/Group4ProjectWebAutomation/TargetRetail/lib/TargetSearch.xlsx");
    public List expectedWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            list.add(xlData.getCellData("Sheet1","cup",i));
        }
        System.out.println(list);
        return list;
    }
}
