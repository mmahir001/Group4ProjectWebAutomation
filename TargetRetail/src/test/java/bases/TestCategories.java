package bases;

import base.Categories;
import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCategories extends MainAPI {
    Categories newCat;

    @BeforeMethod
    public void initialize() {
        newCat = PageFactory.initElements(driver, Categories.class);
    }

//    @Test
//    public void testCategories() throws Exception{
//        newCat.clickCtagories();
//    }

    @Test
    public void testWomenTab()throws Exception{
        newCat.clickWommenTab();
    }
     @Test
    public void testClickMan() throws Exception{
        newCat.clickMan();
    }
    @Test
    public void testClickYoungAdult() throws Exception{
        newCat.clcikYoungAdult();
    }
    @Test
    public void testClickKids() throws Exception{
        newCat.clickKids();
    }
    @Test
    public void testClickBaby() throws Exception{
        newCat.clickBaby();
    }
    @Test
    public void testClickShoes() throws Exception{
        newCat.clickShoes();
    }
    @Test
    public void testClickHome() throws Exception{
        newCat.clickHome();
    }
    @Test
    public void testClickFurniture() throws Exception{
        newCat.clickFurniture();
    }
    @Test
    public void testClickKitchenDining() throws Exception{
        newCat.clickKitchenDining();
    }
    @Test
    public void testClickPatioGarden() throws Exception{
        newCat.clickPatioGarden();
    }
    @Test
    public void testClickToys() throws Exception{
        newCat.clickToys();
    }
    @Test
    public void testClickElectronics() throws Exception{
        newCat.clickElectronics();
    }
    @Test
    public void testClickVideoGames() throws Exception{
        newCat.clickVideoGames();
    }
    @Test
    public void testClickMoviesMusicBooks() throws Exception{
        newCat.clickMoviesMusicBooks();
    }
    @Test
    public void testClickSportsOutdoors() throws Exception{
        newCat.clickSportsOutdoors();
    }
    @Test
    public void testClickBeauty() throws Exception{
        newCat.clickBeauty();
    }
    @Test
    public void testClickHealth() throws Exception{
        newCat.clickHealth();
    }
    @Test
    public void testClickHouseholdEssentials() throws Exception{
        newCat.clickHouseholdEssentials();
    }
    @Test
    public void testClickPets() throws Exception{
        newCat.clickPets();
    }
    @Test
    public void testClickGrocery() throws Exception{
        newCat.clickGrocery();
    }




    }





