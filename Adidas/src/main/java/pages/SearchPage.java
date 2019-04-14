package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SearchPage extends MainAPI {

    @FindBy(xpath = "//input[@placeholder='search']")
    WebElement searchBox;

    public void insertValue1() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Shoes");
        searchBox.submit();
    }

    public void insertValue2() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("boots");
        searchBox.submit();
    }

    public void insertValue3() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("hoodies");
        searchBox.submit();
    }

    public void insertValue4() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Socks");
        searchBox.submit();
    }

    public void insertValue5() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("jacket");
        searchBox.submit();
    }

    public void insertValue6() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("hats");
        searchBox.submit();
    }

    public void insertValue7() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("accessories");
        searchBox.submit();
    }

    public void insertValue8() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("original");
        searchBox.submit();
    }

    public void insertValue9() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("kids shoes");
        searchBox.submit();
    }

    public void insertValue10() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("womens shoes");
        searchBox.submit();
    }
}