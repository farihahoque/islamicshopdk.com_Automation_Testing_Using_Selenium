package Testcases;

import Pages.BookPage;
import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestClickChechout extends utilities.DriverSetup {

    HomePage homePage=new HomePage();
    BookPage bookpage=new BookPage();
    CartPage cartPage=new CartPage();


    @BeforeMethod
    public void VisitPage() {
        homePage.loadHomePage();
    }

    @Test
    public void TestClickCheckout(){
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 200).build().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement FirstBook= wait.until(ExpectedConditions.elementToBeClickable(bookpage.clickbook2));
        actions.click(FirstBook).build().perform();
        bookpage.clickOnElement(bookpage.AddToCart);
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(homePage.Cart));
        actions.doubleClick(element).build().perform();
        cartPage.getDisplayStatus(cartPage.checkout);

    }
}
