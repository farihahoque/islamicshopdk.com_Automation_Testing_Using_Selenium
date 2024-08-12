package Testcases;

import Pages.BookPage;
import Pages.CartPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestProvideAllInformation extends utilities.DriverSetup {
    HomePage homePage=new HomePage();
    BookPage bookpage=new BookPage();
    CartPage cartPage=new CartPage();


  @BeforeMethod
   public void VisitPage() {
        homePage.loadHomePage();
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 200).build().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement FirstBook= wait.until(ExpectedConditions.elementToBeClickable(bookpage.clickbook2));
        actions.click(FirstBook).build().perform();
        WebElement Bookorder= wait.until(ExpectedConditions.elementToBeClickable(bookpage.clickorder));
         actions.doubleClick(Bookorder).build().perform();


    }

    @Test
    public void TestGiveAllInformationWithInsideDhaka(){
       cartPage.writeOnElement(cartPage.Name,"Fara");
       cartPage.writeOnElement(cartPage.Number,"6789065467");
       cartPage.writeOnElement(cartPage.AltNum,"09876467890");
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        cartPage.writeOnElement(cartPage.BillAddress,"dhanmondi 27,dhaka");
        cartPage.clickOnElement(cartPage.NextButton);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement CODdHAKA= wait.until(ExpectedConditions.elementToBeClickable(cartPage.CodDhaka));
        actions.doubleClick(CODdHAKA).build().perform();
        cartPage.clickOnElement(cartPage.next2);
        WebElement COD= wait.until(ExpectedConditions.elementToBeClickable(cartPage.COD));
        actions.doubleClick(COD).build().perform();

        
    }
    @Test
    public void TestGiveAllInformationWithBkash(){
        cartPage.writeOnElement(cartPage.Name,"Fara");
        cartPage.writeOnElement(cartPage.Number,"6789065467");
        cartPage.writeOnElement(cartPage.AltNum,"09876467890");
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        cartPage.writeOnElement(cartPage.BillAddress,"dhanmondi 27,dhaka");
        cartPage.clickOnElement(cartPage.NextButton);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement CODdHAKA= wait.until(ExpectedConditions.elementToBeClickable(cartPage.CodDhaka));
        actions.doubleClick(CODdHAKA).build().perform();
        cartPage.clickOnElement(cartPage.next2);
        WebElement bkash= wait.until(ExpectedConditions.elementToBeClickable(cartPage.Bkash));
        actions.doubleClick(bkash).build().perform();
        actions.scrollByAmount(0, 300).build().perform();
        cartPage.writeOnElement(cartPage.bkashnum,"01796783428");
        cartPage.writeOnElement(cartPage.bkashtran,"XGDSFGFGJFHGCCF");
       cartPage.getDisplayStatus(cartPage.placeorder);

    }

    @Test
    public void TestGiveAllInformationWithnagad() {
        cartPage.writeOnElement(cartPage.Name, "Fara");
        cartPage.writeOnElement(cartPage.Number, "6789065467");
        cartPage.writeOnElement(cartPage.AltNum, "09876467890");
        Actions actions = new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        cartPage.writeOnElement(cartPage.BillAddress, "dhanmondi 27,dhaka");
        cartPage.clickOnElement(cartPage.NextButton);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement CODdHAKA = wait.until(ExpectedConditions.elementToBeClickable(cartPage.CodDhaka));
        actions.doubleClick(CODdHAKA).build().perform();
        cartPage.clickOnElement(cartPage.next2);
        actions.scrollByAmount(0, 400).build().perform();
        WebElement nagad = wait.until(ExpectedConditions.elementToBeClickable(cartPage.nagad));
        actions.doubleClick(nagad).build().perform();
        cartPage.writeOnElement(cartPage.nahadnum, "01796783428");
        cartPage.writeOnElement(cartPage.nagadtran, "XGDSFGFGJFHGCCF");
        cartPage.getDisplayStatus(cartPage.placeorder);
    }
    @Test
    public void TestPreviousButton(){
        cartPage.writeOnElement(cartPage.Name,"Fara");
        cartPage.writeOnElement(cartPage.Number,"6789065467");
        cartPage.writeOnElement(cartPage.AltNum,"09876467890");
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        cartPage.writeOnElement(cartPage.BillAddress,"dhanmondi 27,dhaka");
        cartPage.clickOnElement(cartPage.NextButton);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement CODdHAKA= wait.until(ExpectedConditions.elementToBeClickable(cartPage.CodDhaka));
        actions.doubleClick(CODdHAKA).build().perform();
        cartPage.clickOnElement(cartPage.next2);
        cartPage.clickOnElement(cartPage.Previous);
        WebElement CODoutdHAKA= wait.until(ExpectedConditions.elementToBeClickable(cartPage.CodOutsideDhaka));
        actions.doubleClick(CODoutdHAKA).build().perform();
    }
}
