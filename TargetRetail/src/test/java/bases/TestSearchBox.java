package bases;

import base.MainAPI;
import base.SearchBox;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchBox extends MainAPI {

    SearchBox sb;

    @BeforeMethod

    public void initialize() {
        sb = PageFactory.initElements(driver,SearchBox.class);
    }

    @Test
    public void search () {
        sb.searchGoldTableLamp();
    }
    @Test
    public void search2 () {
        sb.searchClocks();
    }
    @Test
    public void search3 () {
        sb.searchVases();
    }
    @Test
    public void search4 () {
        sb.searchGames();
    }
    @Test
    public void search5 () {
        sb.searchMirrors();
    }
    @Test
    public void search6 () {
        sb.searchGloves();
    }
    @Test
    public void search7 () {
        sb.searchPillow();
    }
    @Test
    public void search8 () {
        sb.searchWallArt();
    }

    @Test
    public void search9() {
        sb.searchBookBags();
    }

    @Test
    public void searc10 () {
        sb.searchWaterBottle();
    }

    @Test
    public void search11() {
        sb.searchFlowers();
    }


}
