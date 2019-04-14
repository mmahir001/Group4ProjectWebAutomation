package youtubeTests;

import base.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtubePages.HomePage;
import youtubePages.InfoPage;

public class InfoPageTester extends MainAPI {
    InfoPage ip;

    @BeforeMethod
    public void initilizeHomePage(){
        ip = PageFactory.initElements(driver, InfoPage.class);
    }

    @Test
    public void VerifyTitle(){
        ip.title();
    }

    @Test
    public void clickYP(){
        String actual = ip.clickYTPremium();
        String expected = "YouTube Premium";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickLive2(){
        String actual = ip.clickLive2();;
        String expected = "Live";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickSettings(){
        String actual = ip.clickYTSettings();;
        String expected = "Settings";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickReportHistory(){
        String actual = ip.clickReportHistory();;
        String expected = "Report history";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void clickHelp(){
        String actual = ip.clickYTHelp();;
        String expected = "Help";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickSF(){
        String actual = ip.clickSendFeedback();;
        String expected = "Send feedback";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickAbout(){
        String actual = ip.clickAbout();;
        String expected = "About";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickPress(){
        String actual = ip.clickPress();;
        String expected = "Press";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickCopyright(){
        String actual = ip.clickCopyRight();;
        String expected = "Copyright";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickAD(){
        String actual = ip.clickAdvertise();;
        String expected = "Advertise";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickDevelopers(){
        String actual = ip.clickDevelopers();;
        String expected = "Developers";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickTerms(){
        String actual = ip.clickTerms();;
        String expected = "Terms";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickPrivacy(){
        String actual = ip.clickPrivacyy();;
        String expected = "Privacy";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickPNS(){
        String actual = ip.clickPolicyNSafety();;
        String expected = "Policy & Safety";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void clickTNF(){
        String actual = ip.clickTestFeatures();;
        String expected = "Test new features";
        Assert.assertEquals(actual,expected);
    }
}
