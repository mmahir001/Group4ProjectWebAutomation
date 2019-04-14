package tests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchPageTester extends MainAPI {
    SearchPage searchPage;

    @BeforeMethod
    public void initilize(){
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void enterElement1(){
        searchPage.insertValue1();
    }

    @Test
    public void enterElement2(){
        searchPage.insertValue2();
    }

    @Test
    public void enterElement3(){
        searchPage.insertValue3();
    }

    @Test
    public void enterElement4(){
        searchPage.insertValue4();
    }

    @Test
    public void enterElement5(){
        searchPage.insertValue5();
    }

    @Test
    public void enterElement6(){
        searchPage.insertValue6();
    }

    @Test
    public void enterElement7(){
        searchPage.insertValue7();
    }

    @Test
    public void enterElement8(){
        searchPage.insertValue8();
    }

    @Test
    public void enterElement9(){
        searchPage.insertValue9();
    }

    @Test
    public void enterElement10(){
        searchPage.insertValue10();
    }
}
