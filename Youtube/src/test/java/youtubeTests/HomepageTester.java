package youtubeTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtubePages.HomePage;

public class HomepageTester extends MainAPI {
    HomePage hp;

    @BeforeMethod
    public void initilizeHomePage(){
        hp = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void VerifyTitle(){hp.title();
    }

    @Test
    public void clickTrending(){
        String actual = hp.clickTrending();
        String expected = "Trending";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickHistory(){
        String actual = hp.clickHistory();;
        String expected = "History";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickMusic(){
        String actual = hp.clickMusic();;
        String expected = "Music";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickSports(){
        String actual = hp.clickSports();;
        String expected = "Sports";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void clickGaming(){
        String actual = hp.clickGaming();;
        String expected = "Gaming";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickMovies(){
        String actual = hp.clickMovies();;
        String expected = "Movies";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickTvShows(){
        String actual = hp.clickTvShows();;
        String expected = "TV Shows";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickNews(){
        String actual = hp.clickNews();;
        String expected = "News";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickLive(){
        String actual = hp.clickLive();;
        String expected = "Live";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickSpotlight(){
        String actual = hp.clickSpotlight();;
        String expected = "Spotlight";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void click360Video(){
        String actual = hp.click360Video();;
        String expected = "360° Video";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickBrowseChannels(){
        String actual = hp.clickBrowseChannels();;
        String expected = "Browse channels";
        Assert.assertEquals(actual,expected);
    }
}
