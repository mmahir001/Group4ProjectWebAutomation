package youtubePages;

import base.MainAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class InfoPage extends MainAPI {

    @FindBy(xpath = "//div[@id='container']//yt-icon[@id='guide-icon']")
    public static WebElement drop;

    @FindBy(xpath = "//span[contains(text(),'YouTube Premium')]")
    WebElement YTPremium;

    @FindBy(xpath = "//ytd-guide-section-renderer[5]//div[1]//ytd-guide-entry-renderer[2]//a[1]//paper-item[1]//span[1]")
    WebElement Live;

    @FindBy(xpath = "//span[contains(text(),'Settings')]")
    WebElement YTSettings;

    @FindBy(xpath = "///span[contains(text(),'Report history')]")
    WebElement ReportHistory;

    @FindBy(xpath = "//span[contains(text(),'Help')]")
    WebElement YTHelp;

    @FindBy(xpath = "//span[contains(text(),'Send feedback')]")
    WebElement SendFeedback;

    @FindBy(xpath = "//a[contains(text(),'About')]")
    WebElement About;

    @FindBy(xpath = "//a[contains(text(),'Press')]")
    WebElement Press;

    @FindBy(xpath = "///a[contains(text(),'Copyright')]")
    WebElement CopyRight;

    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement ContactUs;

    @FindBy(xpath = "//a[contains(text(),'Creators')]")
    WebElement Creators;

    @FindBy(xpath = "//a[contains(text(),'Advertise')]")
    WebElement Advertise;

    @FindBy(xpath = "//a[contains(text(),'Privacy')]")
    WebElement Privacyy;

    @FindBy(xpath = "//span[contains(text(),'News')]")
    WebElement PolicyNSafety;

    @FindBy(xpath = "//a[contains(text(),'Developers')]")
    WebElement Developers;

    @FindBy(xpath = "//a[contains(text(),'Terms')]")
    WebElement Terms;

    @FindBy(xpath = "//a[contains(text(),'Test new features')]")
    WebElement TestFeatures;

    public void title() {
        String actual = driver.getTitle();
        System.out.println(driver.getTitle());
        String expected = "YouTube";
        Assert.assertEquals(expected, actual);
    }

    public String clickYTPremium() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        YTPremium.click();
        String text = YTPremium.getText();
        return text;
    }

    public String clickLive2() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        Live.click();
        String text = Live.getText();
        return text;
    }

    public String clickYTSettings() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        YTSettings.click();
        String text = YTSettings.getText();
        return text;
    }

    public String clickReportHistory() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        ReportHistory.click();
        String text = ReportHistory.getText();
        return text;
    }

    public String clickYTHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        YTHelp.click();
        String text = YTHelp.getText();
        return text;
    }

    public String clickSendFeedback() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        SendFeedback.click();
        String text = SendFeedback.getText();
        return text;
    }

    public String clickAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        About.click();
        String text = About.getText();
        return text;
    }

    public String clickPress() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        Press.click();
        String text = Press.getText();
        return text;
    }

    public String clickCopyRight() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        CopyRight.click();
        String text = CopyRight.getText();
        return text;
    }

    public String clickContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        ContactUs.click();
        String text = ContactUs.getText();
        return text;
    }

    public String clickCreators() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        Creators.click();
        String text = Creators.getText();
        return text;
    }

    public String clickAdvertise() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        Advertise.click();
        String text = Advertise.getText();
        return text;
    }

    public String clickPrivacyy() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        Privacyy.click();
        String text = Privacyy.getText();
        return text;
    }

    public String clickPolicyNSafety() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        PolicyNSafety.click();
        String text = PolicyNSafety.getText();
        return text;
    }


    public String clickDevelopers() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        Developers.click();
        String text = Developers.getText();
        return text;
    }


    public String clickTerms() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        Terms.click();
        String text = Terms.getText();
        return text;
    }


    public String clickTestFeatures() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        drop.click();
        TestFeatures.click();
        String text = TestFeatures.getText();
        return text;
    }
}