package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AllDepartments extends MainAPI {


    @FindBy(xpath = "//a[contains(text(),'All Departments')]")
    public static WebElement dd_AllDepartment;

    public String clickDd_AllDepartment(){
        dd_AllDepartment.click();
        String text =dd_AllDepartment.getText();
        return text;
    }
    @FindBy(xpath = "//li[@class='MainFlyout__item']//a[@title='Appliances'][contains(text(),'Appliances')]")
    public static WebElement dd_Appliances;

    public String clickDd_Appliances(){
        dd_AllDepartment.click();
        dd_Appliances.click();
        String text =driver.getTitle();
        return text;
    }
    @FindBy(xpath = "//li[@class='MainFlyout__item']//a[@title='Blinds & Window Treatment'][contains(text(),'Blinds & Window Treatment')]")
    WebElement blindWindowTreatment;
    @FindBy(xpath = "//a[@title='Blinds'][contains(text(),'Blinds')]")
    WebElement blinds;
    @FindBy(xpath = "//a[@title='Custom Blinds'][contains(text(),'Custom Blinds')]")
    WebElement customBlinds;
    @FindBy(xpath = "//li[@class='MainFlyout__item']//a[@title='Electrical'][contains(text(),'Electrical')]")
    WebElement electrical;
    @FindBy(xpath = "//a[@title='Wire'][contains(text(),'Wire')]")
    WebElement wire;
    @FindBy(xpath = "//a[@title='Hardware'][contains(text(),'Hardware')]")
    WebElement hardWare;
    @FindBy(xpath = "//a[@title='Gate Hardware']")
    WebElement gateHardware;
    @FindBy(xpath = "//a[@title='Gate Kits']")
    WebElement gateKits;

    public String HoverOverGateKits(){
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(hardWare).perform();
        action.moveToElement(gateHardware).perform();
        action.moveToElement(gateKits).click();
        String text = gateKits.getText();
        return text;
    }

    public String clickElectrical() {
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(electrical).click();
        String text = driver.getTitle();
        return text;
    }
    public String HoverOverWire() {
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(electrical).perform();
        action.moveToElement(wire).click();
        String text = wire.getText();
        return text;
    }

        public String HoverOverCustomBlinds(){
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(blindWindowTreatment).perform();
        action.moveToElement(blinds).perform();
        action.moveToElement(customBlinds).click();
        String text = customBlinds.getText();
        return text;
    }
    public String HoverOverBlinds(){
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(blindWindowTreatment).perform();
        action.moveToElement(blinds).click();
        String text = blinds.getText();
        return text;
    }

    ///////// *******************Select dropDown Item from All Departments **************

    @FindBy(xpath = "//a[@title='Appliance Special Buys']")
    public static WebElement applienceSpecialBuys;
    @FindBy(xpath = "//a[contains(text(),'Appliance Special Buys')]")
    public static WebElement apSpecialText;

    public String HoverOverAppliencesSpecialBuys(){
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(dd_Appliances).perform();
        action.moveToElement(applienceSpecialBuys).click();
        String text = apSpecialText.getText();
        return text;
    }
    @FindBy(xpath = "//li[@class='MainFlyout__item']//a[@title='Bath & Faucets'][contains(text(),'Bath & Faucets')]")
    public static WebElement bathFaucets;
    @FindBy(xpath = "//a[@title='Bathroom Faucets']")
    public static WebElement bathroomFacets;
    @FindBy(xpath = "//a[@title='Bathroom Sink Faucets'][contains(text(),'Bathroom Sink Faucets')]")
    public static WebElement bathroomSinkFacets;


    public String HoverOverbathroomFaucets(){
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(bathFaucets).perform();
        action.moveToElement(bathroomFacets).perform();
        action.moveToElement(bathroomSinkFacets).click();
        String text = bathroomSinkFacets.getText();
        return text;
    }



}
