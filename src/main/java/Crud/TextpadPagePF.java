package Crud;

import Service.Basis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TextpadPagePF extends Basis {

    public String acropliaHomeURL = "https://demo.acroplia.com/connect/";

    @FindBy(how = How.XPATH, using ="//*[@data-onboarding=\"mainArea\"]/div[1]/div[3]")
    WebElement plusButton;

    @FindBy(how = How.XPATH, using = "//*[@data-onboarding=\"mainArea\"]/div[2]/div[2]/div[1]/div[2]/div[1]")
    WebElement createInLibraryButton;

    @FindBy(how = How.XPATH, using = "//*[@data-xpath=\"context-menu\"]/div[1]")
    WebElement noteButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"clear-input\"]")
    WebElement noteTitle;

    @FindBy(how = How.XPATH, using = "//*[@class=\"Bar_item_26iJx Bar_community_6Ay_8\"]")
    WebElement communityButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"ql-editor ql-blank\"]/p")
    WebElement subTitle;

    public TextpadPagePF(WebDriver driver){
        this.driver = driver;
    }



    public void TextpadCreate(String title, String subtitle){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(acropliaHomeURL);
        communityButton.click();
        plusButton.click();
        plusButton.click();
        createInLibraryButton.click();
        noteButton.click();
        noteTitle.click();
        noteTitle.clear();
        noteTitle.sendKeys(title);
        subTitle.click();
        subTitle.sendKeys(subtitle);
        plusButton.click();
    }



}
