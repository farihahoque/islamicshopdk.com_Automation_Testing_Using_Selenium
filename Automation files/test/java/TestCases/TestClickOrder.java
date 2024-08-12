package Testcases;

import Pages.BookPage;
import Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestClickOrder extends utilities.DriverSetup {
    HomePage homePage=new HomePage();
    BookPage bookPage=new BookPage();
    @BeforeMethod
    public void VisitPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.GeneralBook);
        homePage.clickOnElement(bookPage.clickBook);
    }

    @Test
    public void TestViewBook() {
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(bookPage.clickorder)).click();


    }
}
