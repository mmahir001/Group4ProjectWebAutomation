package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Categories extends MainAPI {

    @FindBy (xpath = "//span[contains(text(),'Categories')]")
    public static WebElement categories;
    public void clickCategories() throws Exception{
        categories.click();
    }

    @FindBy(xpath = "//div[contains(text(),'Women')]")
    public static WebElement women;
    public void clickWomenTab() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(women).perform();

    }

    @FindBy(xpath = "//div[contains(text(),'Men')]")
    public static WebElement men;
    public void clickMan() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(men).perform();
    }

    @FindBy (xpath = "//div[contains(text(),'Young Adult')]")
    public static WebElement young_Adult;
    public void clcikYoungAdult()throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(young_Adult).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Kids')]")
    public static WebElement kids;
    public void clickKids()throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(kids).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Baby')]")
    public static WebElement baby;
    public void clickBaby () throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(baby).perform();

    }
    @FindBy (xpath = "//div[contains(text(),'Shoes')]")
    public static WebElement shoes;
    public void clickShoes() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(shoes).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Home')]")
    public static WebElement home;
    public void clickHome() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(home).perform();
    }


    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Furniture')]")
    public static WebElement furniture;
    public void clickFurniture() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(furniture).perform();
    }
    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Kitchen & Dining')]")
    public static WebElement kitchenDining;
    public void clickKitchenDining() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(kitchenDining).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Patio & Garden')]")
    public static WebElement patioGarden;
    public void clickPatioGarden() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(patioGarden).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Toys')]")
    public static WebElement toys;
    public void clickToys() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(toys).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Electronics')]")
    public static WebElement electronics;
    public void clickElectronics() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(electronics).perform();
    }
    @FindBy (xpath = "//div[contains(text(),'Video Games')]")
    public static WebElement videoGames;
    public void clickVideoGames() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(videoGames).perform();
    }

    @FindBy (xpath = "//div[contains(text(),'Movies, Music & Books')]")
    public static WebElement moviesMusicBooks;
    public void clickMoviesMusicBooks() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(moviesMusicBooks).perform();
    }

    @FindBy (xpath = "//div[contains(text(),'Sports & Outdoors')]")
    public static WebElement sportsOutdoors;
    public void clickSportsOutdoors() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(sportsOutdoors).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Beauty')]")
    public static WebElement beauty;
    public void clickBeauty() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(beauty).perform();
    }
    @FindBy (xpath = "//div[contains(text(),'Health')]")
    public static WebElement health;
    public void clickHealth() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(health).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Household Essentials')]")
    public static WebElement householdEssentials;
    public void clickHouseholdEssentials() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(householdEssentials).perform();
    }

    @FindBy (xpath = "//div[contains(text(),'Pets')]")
    public static WebElement pets;
    public void clickPets() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(pets).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Grocery')]")
    public static WebElement grocery;
    public void clickGrocery() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(grocery).perform();
    }
    @FindBy (xpath = "//div[contains(text(),'Luggage')]")
    public static WebElement luggage;
    public void clickLuggage() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(luggage).perform();
    }

    @FindBy (xpath = "//div[contains(text(),'School & Office Supplies')]")
    public static WebElement schoolOfficeSupplies;
    public void clickSchoolOfficeSuppies() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(schoolOfficeSupplies).perform();
    }

    @FindBy (xpath = "//div[contains(text(),'Party Supplies')]")
    public static WebElement partySupplies;
    public void clickPartySupplies() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(partySupplies).perform();
    }

    @FindBy (xpath = "//div[contains(text(),'Musical Instruments')]")
    public static WebElement musicalInstruments;
    public void clickMusicalInstruments() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(musicalInstruments).perform();
    }

    @FindBy (xpath = "//div[@class='Row-uds8za-0 kjjHUt'][contains(text(),'Clearance')]")
    public static WebElement clearance;
    public void clickClearance() throws Exception{
        Actions actions = new Actions(driver);
        actions.moveToElement(categories).click();
        actions.moveToElement(clearance).perform();
    }
























}
