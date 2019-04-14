package youtubePages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SettingMenu extends MainAPI {

    @FindBy(xpath = "//ytd-topbar-menu-button-renderer[3]//div[1]//a[1]//yt-icon-button[1]")
    WebElement SettingIcon;

    @FindBy(xpath = "//ytd-toggle-theme-compact-link-renderer[@class='style-scope yt-multi-page-menu-section-renderer']")
    WebElement DarkTheme;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[1]//div[2]//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    WebElement Language;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[1]//div[2]//ytd-compact-link-renderer[2]//a[1]//paper-item[1]")
    WebElement Settings;

    @FindBy(xpath = "//ytd-compact-link-renderer[3]//a[1]//paper-item[1]")
    WebElement Help;

    @FindBy(xpath = "//ytd-compact-link-renderer[4]//a[1]//paper-item[1]")
    WebElement Feedback;

    @FindBy(xpath = "//ytd-compact-link-renderer[5]//a[1]//paper-item[1]")
    WebElement Shortcuts;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[2]//div[2]//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    WebElement Location;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[2]//div[2]//ytd-compact-link-renderer[2]//a[1]//paper-item[1]")
    WebElement Mode;

    public void clickSI() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
    }

    public void clickDT() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        DarkTheme.click();
    }

    public void clickLanguage() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        Language.click();
    }

    public void clickSettings() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        Settings.click();
    }

    public void clickHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        Help.click();
    }

    public void clickFeedback() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        Feedback.click();
    }

    public void clickSC() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        Shortcuts.click();
    }

    public void clickLocation() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        Location.click();
    }

    public void clickMode() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SettingIcon.click();
        Mode.click();
    }
}
