package youtubePages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class YTMenu extends MainAPI {


    @FindBy(xpath = "//ytd-topbar-menu-button-renderer[2]//div[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")
    WebElement ToolBar;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[1]//div[2]//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    WebElement YTTV;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[2]//div[2]//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    WebElement YTMusic;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[2]//div[2]//ytd-compact-link-renderer[2]//a[1]//paper-item[1]")
    WebElement YTKids;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[3]//div[2]//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    WebElement CreatorAcademy;

    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[3]//div[2]//ytd-compact-link-renderer[2]//a[1]//paper-item[1]")
    WebElement YTForArtists;

    public void clickTB() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBar.click();
    }

    public void clickYTTV() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBar.click();
        YTTV.click();
    }

    public void clickYTMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBar.click();
        YTMusic.click();
    }

    public void clickYTKids() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBar.click();
        YTKids.click();
    }

    public void clickCA() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBar.click();
        CreatorAcademy.click();
    }

    public void clickYTForArtists() {
        TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ToolBar.click();
        YTForArtists.click();
    }
}
