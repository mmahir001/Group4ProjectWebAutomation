package pages;

import base.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class SignUpPage extends MainAPI {


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

    public String ClickSignUp(){
        SignUpButton.click();
        String text = SignUpButton.getText();
        return text;}

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement LoginButton;

    public String ClickLogin(){
        LoginButton.click();
        String text = LoginButton.getText();
        return text;}

    @FindBy(xpath = "//a[contains(text(),'About us')]")
    WebElement AboutUsPage;

    public String ClickAboutUs(){
        AboutUsPage.click();
        String text = AboutUsPage.getText();
        return text;}

    @FindBy(xpath = "/html[1]/body[1]/span[1]/section[1]/footer[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
    WebElement Support;

    public void ClickSupport(){
        Support.click();
        }

    @FindBy(xpath = "//a[contains(text(),'Press')]")
    WebElement Press;

    public String ClickPress(){
        Press.click();
        String text = Press.getText();
        return text;}

    @FindBy(xpath = "//a[contains(text(),'API')]")
    WebElement API;

    public String ClickAPI(){
        API.click();
        String text = API.getText();
        return text;}

    @FindBy(xpath = "//a[contains(text(),'Jobs')]")
    WebElement Jobs;

    public String ClickJobs(){
        Jobs.click();
        String text =Jobs.getText();
        return text;}

    @FindBy(xpath = "//a[contains(text(),'Privacy')]")
    WebElement Privacy;

    public String ClickPrivacy(){
        Privacy.click();
        String text = Privacy.getText();
        return text;}

    @FindBy(xpath = "/html[1]/body[1]/span[1]/section[1]/footer[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")
    WebElement Terms;

    public void ClickTerms(){
        Terms.click();
        }

    @FindBy(xpath = "//a[contains(text(),'Directory')]")
    WebElement Directory;

    public String ClickDirectory(){
        Directory.click();
        String text = Directory.getText();
        return text;}

    @FindBy(xpath = "//a[contains(text(),'Profiles')]")
    WebElement Profiles;

    public String ClickProfiles(){
        Profiles.click();
        String text = Profiles.getText();
        return text;}

    @FindBy(xpath = "//a[contains(text(),'Hashtags')]")
    WebElement Hashtags;

    public String ClickHashtags(){
        Hashtags.click();
        String text = Hashtags.getText();
        return text;}

    @FindBy(xpath = "//select[@class='hztqj']")
    WebElement Language;

    public void ClickLanguage(){
        Language.click();
        }
}





