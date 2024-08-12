package Testcases;

import Pages.BookPage;
import Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ViewAnyBook extends utilities.DriverSetup {
    HomePage homePage=new HomePage();
    BookPage bookPage=new BookPage();

    @BeforeMethod
    public void VisitPage(){
        homePage.loadHomePage();

    }

    @Test
    public void TestViewBook() {
        homePage.clickOnElement(homePage.GeneralBook);
        homePage.clickOnElement(bookPage.clickBook);

    }
}
