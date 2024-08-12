package Pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    public WebElement getElement(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1000));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void clickOnElement(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1500));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public static void loadAWebPage(String url){

        getDriver().get(url);
    }

    public void writeOnElement(By locator, String text){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1500));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).clear();
        //getElement(locator).clear();
        WebDriverWait wait1 = new WebDriverWait(getDriver(), Duration.ofSeconds(1500));
        wait1.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }

    public Boolean getDisplayStatus(By locator){
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1000));
            return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public String getAttributeText(By locator, String attributeName){
        return getElement(locator).getAttribute(attributeName);
    }

    public String getElementText(By locator){

        return getElement(locator).getText();
    }

    public void addScreenshot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES))) ;
    }

}

