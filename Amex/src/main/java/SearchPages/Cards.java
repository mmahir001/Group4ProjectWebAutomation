package SearchPages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Cards extends MainAPI{

    @FindBy(xpath = "//label[@id='label-cards']")
    WebElement cards;
    @FindBy(xpath = "//a[contains(text(),'Credit Card Offers')]")
    WebElement cardOffers;
    @FindBy(xpath = "//a[@class='actived']//span[@class='ng-binding'][contains(text(),'Featured Cards')]")
    WebElement featuredCards;
    @FindBy(xpath = "//span[contains(text(),'Travel Cards')]")
    WebElement travelCards;
    @FindBy(xpath = "//span[contains(text(),'Cash Back Cards')]")
    WebElement CashBackCads;
    @FindBy(xpath = "//span[contains(text(),'Rewards Points Cards')]")
    WebElement rewardsPointsCards;
    @FindBy(xpath = "//a[@title='View Details for the American Express® Gold Card']")
    WebElement goldCard;
    @FindBy(xpath = "//a[@title='View Details for the Cash Magnet® Card']")
    WebElement cashMagnet;


    public String clickCardOffers(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        cardOffers.click();
        String text = cardOffers.getText();
        return text;
    }
    public String clickFeatureCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        cardOffers.click();
        featuredCards.click();
        String text = featuredCards.getText();
        return text;
    }
    public String clickTravelcards(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        cardOffers.click();
        travelCards.click();
        String text = travelCards.getText();
        return text;
    }
    public String clickCashBackCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        cardOffers.click();
        CashBackCads.click();
        String text = CashBackCads.getText();
        return text;
    }
    public String clickRewardsCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        cardOffers.click();
        rewardsPointsCards.click();
        String text = rewardsPointsCards.getText();
        return text;
    }
    public String goldCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        cardOffers.click();
        goldCard.click();
        String text = goldCard.getText();
        return text;
    }
    public String clickCashMagnet(){
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cards.click();
        cardOffers.click();
        cashMagnet.click();
        String text = cashMagnet.getText();
        return text;
    }


}

