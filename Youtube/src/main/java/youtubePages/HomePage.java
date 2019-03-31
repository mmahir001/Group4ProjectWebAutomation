package youtubePages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends MainAPI {

    @FindBy(xpath = "//div[@id='container']//yt-icon[@id='guide-icon']")
    public static WebElement drop;

    @FindBy(xpath = "//span[@class='title style-scope ytd-guide-entry-renderer'][contains(text(),'Trending')]")
    WebElement trending;

    @FindBy(xpath = "//span[contains(text(),'History')]")
    WebElement history;

    @FindBy(xpath = "//span[contains(text(),'Music')]")
    WebElement music;

    @FindBy(xpath = "//span[contains(text(),'Sports')]")
    WebElement sports;

    @FindBy(xpath = "//span[contains(text(),'Gaming')]")
    WebElement gaming;

    @FindBy(xpath = "//span[contains(text(),'Movies')]")
    WebElement movies;

    @FindBy(xpath = "//span[contains(text(),'TV Shows')]")
    WebElement tvShows;

    @FindBy(xpath = "//span[contains(text(),'News')]")
    WebElement news;

    @FindBy(xpath = "//ytd-guide-entry-renderer[7]//a[1]//paper-item[1]//span[1]")
    WebElement liveChannel;

    @FindBy(xpath = "//span[contains(text(),'Spotlight')]")
    WebElement spotlight;

    @FindBy(xpath = "//span[contains(text(),'360° Video')]")
    WebElement videoIn360;

    @FindBy(xpath = "//span[contains(text(),'Browse channels')]")
    WebElement browseChannels;


    public void title(){
        String actual = driver.getTitle();
        System.out.println(driver.getTitle());
        String expected = "YouTube";
        Assert.assertEquals(expected, actual);
    }

    public String clickTrending(){
        drop.click();
        trending.click();
        String text = trending.getText();
        return text;
    }

    public String clickHistory(){
        drop.click();
        history.click();
        String text = history.getText();
        return text;
    }

    public String clickMusic(){
        drop.click();
        music.click();
        String text = music.getText();
        return text;
    }

    public String clickSports(){
        drop.click();
        sports.click();
        String text = sports.getText();
        return text;
    }

    public String clickGaming(){
        drop.click();
        gaming.click();
        String text = gaming.getText();
        return text;
    }

    public String clickMovies(){
        drop.click();
        movies.click();
        String text = movies.getText();
        return text;
    }

    public String clickTvShows(){
        drop.click();
        tvShows.click();
        String text = tvShows.getText();
        return text;
    }

    public String clickNews(){
        drop.click();
        news.click();
        String text = news.getText();
        return text;
    }

    public String clickLive(){
        drop.click();
        liveChannel.click();
        String text = liveChannel.getText();
        return text;
    }

    public String clickSpotlight(){
        drop.click();
        spotlight.click();
        String text = spotlight.getText();
        return text;
    }

    public String click360Video(){
        drop.click();
        videoIn360.click();
        String text = videoIn360.getText();
        return text;
    }

    public String clickBrowseChannels(){
        drop.click();
        browseChannels.click();
        String text = browseChannels.getText();
        return text;
    }
}