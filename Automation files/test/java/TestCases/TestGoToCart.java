package Testcases;

import Pages.BookPage;
import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestGoToCart extends utilities.DriverSetup {
    HomePage homePage=new HomePage();
    BookPage bookpage=new BookPage();
    CartPage cartPage=new CartPage();
    LoginPage SignUp=new LoginPage();

    @BeforeMethod
    public void VisitPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.GeneralBook);
        homePage.clickOnElement(bookpage.clickBook);

    }

    @Test
    public void GoToCart() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 400).build().perform();
        WebElement Addtocart= wait.until(ExpectedConditions.elementToBeClickable(bookpage.AddToCart));
        actions.doubleClick(Addtocart).build().perform();
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(homePage.Cart));
        actions.doubleClick(element).perform();
        actions.click(element);

    }

    @Test
    public void SameProductsMultipleTime(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 400).build().perform();
        WebElement addmorepro= wait.until(ExpectedConditions.presenceOfElementLocated(bookpage.AddProducct));
        actions.doubleClick(addmorepro);
        WebElement Addtocart= wait.until(ExpectedConditions.elementToBeClickable(bookpage.AddToCart));
        actions.click(Addtocart).build().perform();
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(homePage.Cart));
        actions.doubleClick(element).build().perform();


    }
}
