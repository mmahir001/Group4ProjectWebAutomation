package youtubePages;


import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public class SearchPage extends MainAPI {

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchBox;


    public void insertValue(String insertValue) {
        searchBox.sendKeys(insertValue);
    }

    @FindBy(xpath = "//button[@class='style-scope ytd-searchbox']")
    WebElement searchButton;

    public void clickSearchButton(){
        searchButton.click();
    }


}
