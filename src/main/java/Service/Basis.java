package Service;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Basis {
    public WebDriver driver;
    public WebDriverWait wait;



    protected String openUrl="https://demo.acroplia.com/login";

    @BeforeEach
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
   //     driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
    }
    @AfterEach
    void afterTest()  {
      driver.close();
        //driver.quit(); to close the window
    }

}

