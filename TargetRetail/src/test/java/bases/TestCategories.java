package bases;

import base.Categories;
import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCategories extends MainAPI {
    Categories    newCat;


    String catUrl = "https://www.target.com/?clkid=36998e8eN501111e9ba56060acead98a1&lnm=79373&afid=CitizenHawk&ref=tgt_adv_xasd0002";


    @BeforeMethod
    public void initialize() {
        newCat = PageFactory.initElements(driver, Categories.class);


        driver.navigate().to(catUrl);
//        newCat = PageFactory.initElements(driver, Categories.class);
    }

    @Test
    public void testWomen()throws Exception{
        newCat.clickWomenTab();
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
    @Test
    public void testClickLuggage() throws Exception{
        newCat.clickLuggage();
    }
    @Test
    public void testClickSchoolOfficeSupplies() throws Exception{
        newCat.clickSchoolOfficeSuppies();
    }
    @Test
    public void testClickPartySupplies() throws Exception{
        newCat.clickPartySupplies();
    }

    @Test
    public void testClickMusicalInstruments() throws Exception{
        newCat.clickMusicalInstruments();
    }
    @Test
    public void testClickClearance() throws Exception{
        newCat.clickClearance();
    }

}





