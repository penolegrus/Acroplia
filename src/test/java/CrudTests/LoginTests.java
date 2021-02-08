package CrudTests;

import Crud.LoginPagePF;
import Service.Basis;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTests extends Basis {


    @Test
    public void TitleTest() {
        // to check efficiency
        driver.get(openUrl);
        wait.until(ExpectedConditions.urlToBe("https://demo.acroplia.com/unsupported-browser?returnUrl=/login"));
        String url =  driver.getCurrentUrl();
        Assert.assertTrue(url.contains("https://demo.acroplia.com/unsupported-browser?returnUrl=/login"));
    }


     @Test
     @DisplayName("LoginApi.Login by Valid Email")
    public void TestWebLoginByValidEmail() {
        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver, LoginPagePF.class);
        loginPagePF.LoginByEmail("epickonfetka@gmail.com", "burgeR9240971");
         wait.until(ExpectedConditions.titleIs("Acroplia | Home"));
         String url =  driver.getTitle();
         Assert.assertTrue(url.contains("Acroplia | Home"));
    }

    @Test
    @DisplayName("LoginApi.Login by Invalid Email")
    public void TestWebLoginByInvalidEmail(){
         String invalidEmail = "keks@keks.com";
        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver, LoginPagePF.class);
        loginPagePF.LoginByInvadlidEmail(invalidEmail);
        Assert.assertTrue(loginPagePF.getErrorMessage().isDisplayed());
    }

    @Test
    @DisplayName("LoginApi.Login by Email Invalid Password")
    public void TestWebLoginByEmailInvalidPassword(){

        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver, LoginPagePF.class);
        loginPagePF.LoginByEmail("epickonfetka@gmail.com","123456");
        Assert.assertTrue(loginPagePF.getErrorMessage().isDisplayed());
    }

    @Test
    @DisplayName("LoginApi.Login by Valid Phone")
    public void  TestWebLoginByValidPhone(){
        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver,LoginPagePF.class);
        loginPagePF.LoginByValidPhone("+905488892053", "Saburi123");
        wait.until(ExpectedConditions.titleIs("Acroplia | Home"));
       String url =  driver.getTitle();
       Assert.assertTrue(url.contains("Acroplia | Home"));
    }

    @Test
    @DisplayName("LoginApi.Login by Invalid Phone")
    public void  TestWebLoginByInvalidPhone(){
        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver,LoginPagePF.class);
        loginPagePF.LoginByInvalidPhone("394812311");
        Assert.assertTrue(loginPagePF.getErrorMessage().isDisplayed());
    }

    @Test
    @DisplayName("LoginApi.Login by Phine Invalid Password")
    public void TestWebLoginByPhoneInvalidPassword(){
        driver.get(openUrl);
        LoginPagePF loginPagePF = PageFactory.initElements(driver,LoginPagePF.class);
        loginPagePF.LoginByValidPhone("+905488892053", "fakepassword");
        Assert.assertTrue(loginPagePF.getErrorMessage().isDisplayed());
    }


}
