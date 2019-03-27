package bases;

import base.Categories;
import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCategories extends MainAPI {
    Categories newCat;

    @BeforeMethod
    public void initialize()
    {
        newCat = PageFactory.initElements(driver, Categories.class);
    }

    @Test
    public void testDeals()throws Exception{
        newCat.clickDeals();
    }
    @Test
    public void testCategories() throws Exception{
        newCat.clickCtagories();
    }

    @Test
    public void testWomenTab()throws Exception{
        newCat.clickOnWomensTab();
    }
    @Test
    public void testClickMan() throws Exception{
        newCat.clickCtagories();
        newCat.clickSecondCtagories();
        newCat.clickMan();
    }

}
