package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class MainPage extends MainAPI {

//    @FindBy(xpath = "//div[@class='header___3wNCY gl-is-sticky fixed___3ea04']//button[1]")
//    public static WebElement drop;

    @FindBy(xpath = "//a[@class='label'][contains(text(),'Men')]")
    WebElement men;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement NewArrivals;

    @FindBy(xpath = "//a[@href='/us/men-best_sellers'][contains(text(),'Best Sellers')]")
    WebElement bestSeller;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Release Dates')]")
    WebElement releaseDate;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'YEEZY')]")
    WebElement Yeeze;

    @FindBy(xpath = "//a[@href='/us/men-nite_jogger']")
    WebElement nite;

    @FindBy(xpath = "//a[@href='/us/men-ultraboost']")
    WebElement ultarboost;

    @FindBy(xpath = "//a[@href='/us/men-boston_marathon']")
    WebElement bostonM;

    @FindBy(xpath = "//a[@href='/us/men-continental_80']")
    WebElement continental;

    @FindBy(xpath = "//a[@href='/us/men-sale']")
    WebElement sale;

    @FindBy(xpath = "//a[@href='/us/men-originals-shoes']")
    WebElement originals;

    @FindBy(xpath = "//a[@href='/us/men-running-shoes']")
    WebElement running;

    @FindBy(xpath = "//a[@href='/us/men-soccer-shoes']")
    WebElement soccer;

    @FindBy(xpath = "//a[@href='/us/men-basketball-shoes']")
    WebElement basketball;

    @FindBy(xpath = "//a[@href='/us/men-football-cleats']")
    WebElement football;

    @FindBy(xpath = "//a[@href='/us/men-skateboarding-shoes']")
    WebElement skateboarding;

    @FindBy(xpath = "//a[@href='/us/men-training-shoes']")
    WebElement workout;

    @FindBy(xpath = "//a[@href='/us/men-essentials-shoes']")
    WebElement essentails;

    @FindBy(xpath = "//a[@href='/us/men-slides']")
    WebElement sandles;

    @FindBy(xpath = "//a[@href='/us/men-outdoor-shoes']")
    WebElement hiking;

    @FindBy(xpath = "//a[@href='/us/men-golf-shoes']")
    WebElement golf;

    @FindBy(xpath = "//a[@href='/us/men-tennis-shoes']")
    WebElement tennis;

    @FindBy(xpath = "//a[@href='/us/men-baseball-shoes']")
    WebElement baseball;

    @FindBy(xpath = "//a[@href='/us/men-pants']")
    WebElement pants;

    @FindBy(xpath = "//a[@href='/us/men-hoodies_sweatshirts']")
    WebElement hoodies;

    @FindBy(xpath = "//a[@href='/us/men-jackets']")
    WebElement jackets;

    @FindBy(xpath = "//a[@href='/us/men-track_suits']")
    WebElement track;

    @FindBy(xpath = "//a[@href='/us/men-short_sleeve_shirts']")
    WebElement shortSleeve;

    @FindBy(xpath = "//a[contains(text(),'Graphic T-Shirts')]")
    WebElement graphic;

    @FindBy(xpath = "//a[@href='/us/men-long_sleeve_shirts']")
    WebElement longSleeve;

    @FindBy(xpath = "//a[contains(text(),'Jerseys')]")
    WebElement jerseys;

    @FindBy(xpath = "//a[@href='/us/men-tights']")
    WebElement tights;

    @FindBy(xpath = "//a[@href='/us/men-shorts']")
    WebElement shorts;

    @FindBy(xpath = "//a[@href='/us/men-tank_tops']")
    WebElement tank;

    @FindBy(xpath = "//a[@href='/us/men-bags']")
    WebElement bags;

    @FindBy(xpath = "//a[@href='/us/men-hats']")
    WebElement hats;

    @FindBy(xpath = "//a[@href='/us/men-balls']")
    WebElement balls;

    @FindBy(xpath = "//a[contains(text(),'Gloves')]")
    WebElement gloves;

    @FindBy(xpath = "//a[@href='/us/men-accessories']")
    WebElement accessories;


    public void title(){
        String actual = driver.getTitle();
        System.out.println(driver.getTitle());
        String expected = "adidas Official Website | adidas US";
        Assert.assertEquals(expected, actual);
    }

    public void HoverOneMen() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
    }

    public void goToNewArrivals() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        NewArrivals.click();
        sleepFor(2);
    }

    public void goToBestSellers() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        bestSeller.click();
        sleepFor(2);
    }

    public void goToReleaseDate() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        releaseDate.click();
        sleepFor(2);
    }

    public void goToNiteJogger() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        nite.click();
        sleepFor(2);
    }

    public void goToUltraboost() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        ultarboost.click();
        sleepFor(2);
    }

    public void goToBostonMarathon() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        bostonM.click();
        sleepFor(2);
    }

    public void goToYeezy() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        Yeeze.click();
        sleepFor(2);
    }

    public void goToContinental() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        continental.click();
        sleepFor(2);
    }

    public void goToSale() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        sale.click();
        sleepFor(2);
    }

    public void goToOriginals() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        originals.click();
        sleepFor(2);
    }

    public void goToRunning() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        running.click();
        sleepFor(2);
    }

    public void goToSoccer() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        soccer.click();
        sleepFor(2);
    }

    public void goToBasketball() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        basketball.click();
        sleepFor(2);
    }

    public void goToFootball() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        football.click();
        sleepFor(2);
    }

    public void goToSkate() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        skateboarding.click();
        sleepFor(2);
    }

    public void goToWorkout() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        workout.click();
        sleepFor(2);
    }

    public void goToEssentials() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        essentails.click();
        sleepFor(2);
    }

    public void goToSandals() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        sandles.click();
        sleepFor(2);
    }

    public void goToHiking() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        hiking.click();
        sleepFor(2);
    }

    public void goToGolf() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        golf.click();
        sleepFor(2);
    }

    public void goToTennis() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        tennis.click();
        sleepFor(2);
    }

    public void goToBaseball() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        baseball.click();
        sleepFor(2);
    }

    public void goToPants() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        pants.click();
        sleepFor(2);
    }

    public void goToHoodies() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        hoodies.click();
        sleepFor(2);
    }

    public void goToJackets() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        jackets.click();
        sleepFor(2);
    }

    public void goToTrack() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        track.click();
        sleepFor(2);
    }

    public void goToShortSleeves() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        shortSleeve.click();
        sleepFor(2);
    }

    public void goToGraphic() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        graphic.click();
        sleepFor(2);
    }

    public void goToLongSleeves() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        longSleeve.click();
        sleepFor(2);
    }

    public void goToJersey() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        jerseys.click();
        sleepFor(2);
    }

    public void goToTights() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        tights.click();
        sleepFor(2);
    }

    public void goToShorts() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        shorts.click();
        sleepFor(2);
    }

    public void goToTankTops() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        tank.click();
        sleepFor(2);
    }

    public void goToBags() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        bags.click();
        sleepFor(2);
    }

    public void goToHats() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        hats.click();
        sleepFor(2);
    }

    public void goToBalls() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        balls.click();
        sleepFor(2);
    }

    public void goToGloves() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        gloves.click();
        sleepFor(2);
    }

    public void goToAccessories() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform();
        sleepFor(2);
        accessories.click();
        sleepFor(2);
    }
}
