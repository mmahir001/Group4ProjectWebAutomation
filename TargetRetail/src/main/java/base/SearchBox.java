package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class SearchBox  extends MainAPI {

    @FindBy(id = "#search")
    WebElement searchBox;


    public void searchGoldTableLamp(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MainAPI.typeOnElementNEnter("#search","gold table lamp");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }
    public void searchClocks(){
        MainAPI.typeOnElementNEnter("#search","Clocks");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }
    public void searchVases(){
        MainAPI.typeOnElementNEnter("#search","Vases");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }
    public void searchGames(){
        MainAPI.typeOnElementNEnter("#search","Games");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }
    public void searchMirrors(){
        MainAPI.typeOnElementNEnter("#search","Mirrors");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");

    }public void searchGloves(){
        MainAPI.typeOnElementNEnter("#search","Gloves");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }
    public void searchPillow(){
        MainAPI.typeOnElementNEnter("#search","Pillow");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }
    public void searchWallArt(){
        MainAPI.typeOnElementNEnter("#search","Wallart");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }
    public void searchBookBags(){
        MainAPI.typeOnElementNEnter("#search","Book Bags");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");

    }
    public void searchWaterBottle(){
        MainAPI.typeOnElementNEnter("#search","Water Battle");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");
    }

    public void searchFlowers(){
        MainAPI.typeOnElementNEnter("#search","Flowers");
        String st = driver.getTitle();
        System.out.println(st);
        Assert.assertEquals(st,"Target : Expect More. Pay Less.");

    }



}








