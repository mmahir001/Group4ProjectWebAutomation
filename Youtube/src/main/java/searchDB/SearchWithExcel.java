package searchDB;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;
import utility.Readxls;

import java.util.ArrayList;
import java.util.List;

public class SearchWithExcel extends MainAPI{

    Readxls xlData = new Readxls("/Users/muhtasimmahir/IdeaProjects/Group4ProjectWebAutomation/Youtube/lib/youtubeData.xlsx");
    public List expectedWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            list.add(xlData.getCellData("Sheet1","Soccer",i));
        }
        System.out.println(list);
        return list;
    }


}
