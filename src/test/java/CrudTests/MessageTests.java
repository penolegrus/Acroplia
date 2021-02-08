package CrudTests;

import Crud.LoginPagePF;
import Crud.MessagePagePF;
import Service.Basis;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MessageTests extends Basis {


    @Test
    public void TestWebSendMessageByFullname(){
        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver, LoginPagePF.class);
        loginPagePF.LoginByEmail("epickonfetka@gmail.com","burgeR9240971");
        wait.until(ExpectedConditions.urlToBe("https://demo.acroplia.com/home/overview"));
        MessagePagePF messagePagePF = PageFactory.initElements(driver,MessagePagePF.class);
        messagePagePF.SendMessage("Johny Sins", "johnysins", "GOOD BOI");


    }

}
