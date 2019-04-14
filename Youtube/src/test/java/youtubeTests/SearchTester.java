package youtubeTests;


import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtubePages.SearchPage;

public class SearchTester extends MainAPI {
    SearchPage searchPage;

    @BeforeMethod
    public void initilizeSignUpPage(){
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void enterElement(){
        searchPage.insertValue("Music");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement2(){
        searchPage.insertValue("FIFA");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement3(){
        searchPage.insertValue("Gaming");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement4(){
        searchPage.insertValue("java tutorials");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement5(){
        searchPage.insertValue("Gotham");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement6(){
        searchPage.insertValue("World cup");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement7(){
        searchPage.insertValue("How to hack");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement8(){
        searchPage.insertValue("Soccer");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement9(){
        searchPage.insertValue("Cricket");
        searchPage.clickSearchButton();
    }

    @Test
    public void enterElement10(){
        searchPage.insertValue("How to trouble shoot mac");
        searchPage.clickSearchButton();
    }
}
