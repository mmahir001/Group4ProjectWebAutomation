package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class AllDepartments extends MainAPI {


    @FindBy(xpath = "//a[contains(text(),'All Departments')]")
    WebElement dd_AllDepartment;
    @FindBy(xpath = "//li[@class='MainFlyout__item']//a[@title='Appliances'][contains(text(),'Appliances')]")
    WebElement dd_Appliances;
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
    @FindBy(xpath = "//a[@title='Appliance Special Buys']")
    WebElement applienceSpecialBuys;
    @FindBy(xpath = "//a[contains(text(),'Appliance Special Buys')]")
    WebElement apSpecialText;
    @FindBy(xpath = "//li[@class='MainFlyout__item']//a[@title='Bath & Faucets'][contains(text(),'Bath & Faucets')]")
    WebElement bathFaucets;
    @FindBy(xpath = "//a[@title='Bathroom Faucets']")
    WebElement bathroomFacets;
    @FindBy(xpath = "//a[@title='Bathroom Sink Faucets'][contains(text(),'Bathroom Sink Faucets')]")
    WebElement bathroomSinkFacets;

    public String clickDd_AllDepartment(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dd_AllDepartment.click();
        String text =dd_AllDepartment.getText();
        return text;
    }
    public String clickDd_Appliances(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dd_AllDepartment.click();
        dd_Appliances.click();
        String text =driver.getTitle();
        return text;
    }
    public String HoverOverGateKits(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(hardWare).perform();
        action.moveToElement(gateHardware).perform();
        action.moveToElement(gateKits).click();
        String text = gateKits.getText();
        return text;
    }
    public String clickElectrical() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(electrical).click();
        String text = driver.getTitle();
        return text;
    }
    public String HoverOverWire() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(electrical).perform();
        action.moveToElement(wire).click();
        String text = wire.getText();
        return text;
    }
        public String HoverOverCustomBlinds(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(blindWindowTreatment).perform();
        action.moveToElement(blinds).perform();
        action.moveToElement(customBlinds).click();
        String text = customBlinds.getText();
        return text;
    }
    public String HoverOverBlinds(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(blindWindowTreatment).perform();
        action.moveToElement(blinds).click();
        String text = blinds.getText();
        return text;
    }
    ///////// *******************Select dropDown Item from All Departments **************

    public String HoverOverAppliencesSpecialBuys(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(dd_Appliances).perform();
        action.moveToElement(applienceSpecialBuys).click();
        String text = apSpecialText.getText();
        return text;
    }

    public String HoverOverbathroomFaucets(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions action = new Actions(driver);
        action.moveToElement(dd_AllDepartment).perform();
        action.moveToElement(bathFaucets).perform();
        action.moveToElement(bathroomFacets).perform();
        action.moveToElement(bathroomSinkFacets).click();
        String text = bathroomSinkFacets.getText();
        return text;
    }



}
