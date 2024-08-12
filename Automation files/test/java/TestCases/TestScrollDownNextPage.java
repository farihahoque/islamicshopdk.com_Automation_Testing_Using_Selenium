package Testcases;

import Pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScrollDownNextPage extends utilities.DriverSetup {
    HomePage homePage=new HomePage();

    @BeforeMethod
    public void VisitPage(){
        homePage.loadHomePage();

    }

    @Test
    public void TestScrollDownAndNextPage(){
        homePage.clickOnElement(homePage.freeBOOK);
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 500).build().perform();
        getDriver().navigate().forward();

    }


}
