package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class SignUpPage {

    @FindBy(xpath = "//input[@name='emailOrPhone']")
    WebElement phoneOrEmail;

    public void insertEmail(String insertEmail) {
        phoneOrEmail.sendKeys(insertEmail);
    }

    @FindBy(xpath = "/html[1]/body[1]/span[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement fullName;

    public void insertName(String insertName) {
        fullName.sendKeys(insertName);
    }

    @FindBy(xpath = "/html[1]/body[1]/span[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement userName;

    public void insertUserName(String insertUserName) {
        userName.sendKeys(insertUserName);
    }

    @FindBy(xpath = "/html[1]/body[1]/span[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement password;

    public void insertPassword(String insertPassword) {
        password.sendKeys(insertPassword);
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement SignUpButton;

    public void ClickSignUp(){SignUpButton.click();}

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement LoginButton;

    public void ClickLogin(){LoginButton.click();}

    @FindBy(xpath = "//a[contains(text(),'About us')]")
    WebElement AboutUsPage;

    public void ClickAboutUs(){AboutUsPage.click();}

    @FindBy(xpath = "//a[contains(text(),'Support')]")
    WebElement Support;

    public void ClickSupport(){Support.click();}

    @FindBy(xpath = "//a[contains(text(),'Press')]")
    WebElement Press;

    public void ClickPress(){Press.click();}

    @FindBy(xpath = "//a[contains(text(),'API')]")
    WebElement API;

    public void ClickAPI(){API.click();}

    @FindBy(xpath = "//a[contains(text(),'Jobs')]")
    WebElement Jobs;

    public void ClickJobs(){Jobs.click();}

    @FindBy(xpath = "//a[contains(text(),'Privacy')]")
    WebElement Privacy;

    public void ClickPrivacy(){Privacy.click();}

    @FindBy(xpath = "//a[@class='l93RR _vfM2']")
    WebElement Terms;

    public void ClickTerms(){Terms.click();}

    @FindBy(xpath = "//a[contains(text(),'Directory')]")
    WebElement Directory;

    public void ClickDirectory(){Directory.click();}

    @FindBy(xpath = "//a[contains(text(),'Profiles')]")
    WebElement Profiles;

    public void ClickProfiles(){Profiles.click();}

    @FindBy(xpath = "//a[contains(text(),'Hashtags')]")
    WebElement Hashtags;

    public void ClickHashtags(){Hashtags.click();}

    @FindBy(xpath = "//select[@class='hztqj']")
    WebElement Language;

    public void ClickLanguage(){Language.click();}

}




