package homePageTests;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FoxHome extends MainAPI {


    @FindBy(xpath = "//a[@class='js-menu-toggle'][contains(text(),'More')]")
    WebElement dropMenu;
//
//    public String clickMenu(){
//        dropMenu.click();
//        String text = dropMenu.getText();
//        return text;
//    }

    @FindBy(xpath = "//li[@class='menu-news']//a[contains(text(),'World')]")
    WebElement worldNews;

    @FindBy(xpath = "//a[@class='css-nm3jss'][contains(text(),'Africa')]")
    WebElement selectAfrica;

    @FindBy(xpath = "//a[contains(text(),'Americas')]")
    WebElement selectAmerica;

    @FindBy(xpath = "//a[contains(text(),'Asia')]")
    WebElement selectAsia;

    @FindBy(xpath = "//a[contains(text(),'Australia')]")
    WebElement selectAustralia;

    @FindBy(xpath = "//a[@class='css-nm3jss'][contains(text(),'Europe')]")
    WebElement selectEurope;

    @FindBy(css = "//a[contains(text(),'Middle East')]")
    WebElement selectMiddleEast;

    public void seeMenu(){
        dropMenu.click();
    }

    public void chooseWorldNews() {
        worldNews.click();
        driver.navigate().to("https://www.nytimes.com/section/world");
    }

    public void selectCountry() {
        selectAfrica.click();
        driver.navigate().to("https://www.nytimes.com/section/world");
    }

    public void selectCountry2() {
        selectAmerica.click();
        driver.navigate().to("https://www.nytimes.com/section/world");
    }

    public void selectCountry3() {
        selectAsia.click();
        driver.navigate().to("https://www.nytimes.com/section/world");
    }
    public void selectCountry4() {
        selectAustralia.click();
        driver.navigate().to("https://www.nytimes.com/section/world");
    }

    public void selectCountry5() {
        selectEurope.click();
        driver.navigate().to("https://www.nytimes.com/section/world");    }

    public void selectCountry6() {
        selectMiddleEast.click();
        driver.navigate().to("https://www.nytimes.com/section/world");
    }
}
