package MainPage;
import base.MainAPI;
import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageFooter extends MainAPI {
    @FindBy(linkText = "/browse/subtitles")
    public static WebElement audioAndSubtitles;
    public void clickAudioAndSubtitles(){ audioAndSubtitles.click();
    }
    @FindBy(xpath = "//span[.='Audio Description']")
    public static WebElement audioDescriptionLink;
    public void clickAudioDescriptionLink(){ audioDescriptionLink.click();
    }
    @FindBy(xpath = "//span[.='Gift Cards']")
    public static WebElement giftCardsLink;
    public void clickGiftCardsLink(){ giftCardsLink.click();
    }
}

