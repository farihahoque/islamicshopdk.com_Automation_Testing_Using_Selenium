package Testcases;

import Pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class VisitSite extends utilities.DriverSetup {
    HomePage homePage=new HomePage();

    @Test
    public void VisitPage(){
        homePage.loadHomePage();

    }
}
