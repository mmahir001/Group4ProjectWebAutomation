package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class WomensPage extends MainAPI {

    @FindBy(xpath = "//a[@class='label'][contains(text(),'Women')]")
    WebElement women;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'New Arrivals')]")
    WebElement NewArrivals;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Best Sellers')]")
    WebElement bestSeller;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Release Dates')]")
    WebElement releaseDate;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'YEEZY')]")
    WebElement Yeeze;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Nite Jogger')]")
    WebElement nite;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Ultraboost')]")
    WebElement ultarboost;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Boston Marathon')]")
    WebElement bostonM;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Continental 80')]")
    WebElement continental;

    @FindBy(xpath = "//a[@href='/us/women-sale']")
    WebElement sale;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Originals')]")
    WebElement originals;

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi hover___2eYBD']//div[2]//ul[1]//li[2]//a[1]")
    WebElement running;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Workout')]")
    WebElement workout;

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi hover___2eYBD']//div[2]//ul[1]//li[4]//a[1]")
    WebElement basketball;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Essentials')]")
    WebElement essentails;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Sandals & Slides')]")
    WebElement sandles;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Hiking')]")
    WebElement hiking;

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi hover___2eYBD']//div[2]//ul[1]//li[9]//a[1]")
    WebElement golf;

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi hover___2eYBD']//div[2]//ul[1]//li[8]//a[1]")
    WebElement tennis;

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi hover___2eYBD']//div[2]//ul[1]//li[10]//a[1]")
    WebElement soccer;

    @FindBy(xpath = "//a[@href='/us/women-volleyball-shoes'][contains(text(),'Volleyball')]")
    WebElement vollyball;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Pants')]")
    WebElement pants;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Hoodies & Sweatshirts')]")
    WebElement hoodies;

    @FindBy(xpath = "//div[@class='col-5']//a[contains(text(),'Leggings & Tights')]")
    WebElement leggings;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Bags & Backpacks')]")
    WebElement bags;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Hats & Beanies')]")
    WebElement hats;

    @FindBy(xpath = "//div[@class='header-sticky-wrapper header-sticky-selfservice-wrapper-main open']//a[contains(text(),'Socks')]")
    WebElement socks;

    public void HoverOneWomen() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
    }

    public void goToNewArrivals1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        NewArrivals.click();
        sleepFor(2);
    }

    public void goToBestSeller1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        bestSeller.click();
        sleepFor(2);
    }

    public void goToReleaseDate1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        releaseDate.click();
        sleepFor(2);
    }

    public void goToYeezy1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        Yeeze.click();
        sleepFor(2);
    }

    public void goToNiteJogger1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        nite.click();
        sleepFor(2);
    }

    public void goToUltraboost1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        ultarboost.click();
        sleepFor(2);
    }

    public void goToBostonMarathon1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        bostonM.click();
        sleepFor(2);
    }



    public void goToContinental1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        continental.click();
        sleepFor(2);
    }

    public void goToSale1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        sale.click();
        sleepFor(2);
    }

    public void goToOriginals1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        originals.click();
        sleepFor(2);
    }

    public void goToRunning1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        running.click();
        sleepFor(2);
    }

    public void goToWorkout1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        workout.click();
        sleepFor(2);
    }

    public void goToBasketball1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        basketball.click();
        sleepFor(2);
    }

    public void goToEssentials1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        essentails.click();
        sleepFor(2);
    }

    public void goToSandles1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        sandles.click();
        sleepFor(2);
    }

    public void goToHiking1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        hiking.click();
        sleepFor(2);
    }

    public void goToTennis1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        tennis.click();
        sleepFor(2);
    }

    public void goToGolf1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        golf.click();
        sleepFor(2);
    }

    public void goToSoccer1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        soccer.click();
        sleepFor(2);
    }

    public void goToVolleyball1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        vollyball.click();
        sleepFor(2);
    }

    public void goToHoodies1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        hoodies.click();
        sleepFor(2);
    }

    public void goToPants1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        pants.click();
        sleepFor(2);
    }

    public void goToLeggings() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        leggings.click();
        sleepFor(2);
    }

    public void goToBags1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        bags.click();
        sleepFor(2);
    }

    public void goToHats() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        hats.click();
        sleepFor(2);
    }

    public void goToSocks1() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(women).perform();
        sleepFor(2);
        socks.click();
        sleepFor(2);
    }

}
