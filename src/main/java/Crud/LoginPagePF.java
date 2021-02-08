package Crud;

import Service.Basis;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class LoginPagePF extends Basis {


    @FindBy(how = How.XPATH, using ="//*[@class=\"input_input_3BLm7 auth_input_3mAiY auth_email_v3Jvh\"]/input")
    WebElement emailInput;

    @FindBy(how = How.XPATH, using = "//*[@class=\"input_input_3BLm7 auth_input_3mAiY\"]/input")
    WebElement passwordInput;

    @FindBy(how = How.CSS, using = "input[name*=\"phone\"]")
    WebElement phoneInput;

    @FindBy(how = How.XPATH, using = "//*[@class=\"btn-main btn-size-4 button\"]")
    WebElement submitButton;

    @FindBy(how = How.CLASS_NAME, using = "btn-nofiled-blue")
    WebElement continueButton;

    //////////ERRORS///////////
    @FindBy(how = How.XPATH, using = "//*[@data-xpath=\"error_msg\"]")
    WebElement errorMessage;

    public LoginPagePF(WebDriver driver){
        this.driver = driver;


    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    //LoginByEmail performs a login to Acroplia using email
    public void LoginByEmail(String email, String password) {

       continueButton.click();
       emailInput.sendKeys(email);
        submitButton.click();
       passwordInput.sendKeys(password);
       submitButton.click();


    }

    public void LoginByInvadlidEmail(String email){
        continueButton.click();
        emailInput.sendKeys(email);
    }



    //LoginByPhone performs a login to Acroplia using phone
    public void LoginByValidPhone(String phone, String password){
        continueButton.click();
        driver.findElement(By.cssSelector("a")).click();
        phoneInput.clear();
        phoneInput.sendKeys(Keys.BACK_SPACE);
        phoneInput.sendKeys(phone);
        submitButton.click();
        passwordInput.sendKeys(password);
        submitButton.click();

    }

    public void LoginByInvalidPhone(String phone){
        continueButton.click();
        driver.findElement(By.cssSelector("a")).click();
        phoneInput.sendKeys(phone);
        submitButton.click();

    }





}

