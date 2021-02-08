package CrudTests;

import Crud.LoginPagePF;
import Crud.TextpadPagePF;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Service.Basis;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TextPadTests extends Basis{

    @Test
    public void TestWebTextpadCreate(){
        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver, LoginPagePF.class);
        loginPagePF.LoginByEmail("epickonfetka@gmail.com","burgeR9240971");
        wait.until(ExpectedConditions.urlToBe("https://demo.acroplia.com/home/overview"));
        TextpadPagePF textpadPagePF = PageFactory.initElements(driver, TextpadPagePF.class);
        textpadPagePF.TextpadCreate("GOOD BOI", "MY BEST SUBTITLE");
       // Assert.assertEquals("MY BEST SUBTITLE", driver.findElement(By.xpath("//*[@class=\"quick-access_title_1OSrP\"]")).getText());

    }
}
