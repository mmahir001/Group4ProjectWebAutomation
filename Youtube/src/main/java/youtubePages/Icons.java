package youtubePages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Icons extends MainAPI {

    @FindBy(xpath = "//ytd-topbar-menu-button-renderer[1]//div[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")
    WebElement UploadIcon;

    @FindBy(xpath = "//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    WebElement UploadButton;

    @FindBy(xpath = "//ytd-topbar-menu-button-renderer[1]//div[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")
    WebElement GoLive;

    @FindBy(xpath = "//ytd-notification-topbar-button-renderer[@class='style-scope ytd-masthead notification-button-style-type-conversation-default']//yt-icon-button[@id='button']")
    WebElement MessageIcon;

    public void clickUI() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        UploadIcon.click();
    }

    public void clickUploadButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        UploadIcon.click();
        UploadButton.click();
    }

    public void clickGoLive() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        UploadIcon.click();
        GoLive.click();
    }

    public void clickMI() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        MessageIcon.click();
    }
}