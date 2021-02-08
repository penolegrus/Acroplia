package Crud;

import Service.Basis;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Base64;

public class MessagePagePF extends Basis {

    public String acropliaHomeURL = "https://demo.acroplia.com/home/overview";

    @FindBy(how = How.XPATH, using ="//*[@class=\"Contacts_contact_3BEA6\"]")
    WebElement peopleList;

    @FindBy(how = How.XPATH, using = "//a[@class='Bar_item_26iJx'][2]")
    WebElement peopleButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"chat-composer quill-ignore\"]")
    WebElement messageArea;

    @FindBy(how = How.XPATH, using = "//div[@class='ChatMessageComposer_sendButton_3iqDM']/button[@class='TiniButton_tini_button_bLY2n']")
    WebElement sendButton;

    @FindBy(how = How.XPATH, using = "//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")
    WebElement popUpMessageIcon;

    @FindBy(how = How.XPATH, using = "//*[@class=\"Contacts_contactsList_bczUA\"]/div")
    WebElement topUser;

    @FindBy(how = How.XPATH, using = "//*[@class=\"Contacts_contactsList_bczUA\"]/div/div/div")
    WebElement topUserFullname;


    public String tempUser;
    public MessagePagePF(WebDriver driver){
        this.driver = driver;
    }

    public void SendMessage(String fullname, String username, String message){

        driver.get(acropliaHomeURL);
        peopleButton.click();
        if (fullname != "")
        {
             tempUser= topUserFullname.getText();
        }
        sendMessage(message,topUser);
       /* if (tempUser==fullname)
        {
            sendMessage(message,topUser);
        }

        */


    }

    public void sendMessage(String message, WebElement elem){
        elem.click();
       // popUpMessageIcon.click();
        messageArea.click();
        messageArea.sendKeys(message);

        sendButton.click();


    }
}
