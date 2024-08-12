package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class LoginPage extends BasePage {
public By LogTitle=By.xpath("//h2[normalize-space()='Login']");
public By LogEmail=By.xpath("//input[@id='username']");
public By LogPass=By.xpath("//input[@id='password']");
public By Rememeberme=By.xpath("//span[normalize-space()='Remember me']");
public By LogButton=By.xpath("//button[normalize-space()='Log in']");




    HomePage homePage= new HomePage();

    public void navigateToLoginPage(){
        homePage.loadHomePage();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage.Myaccount)).click();

    }

}
