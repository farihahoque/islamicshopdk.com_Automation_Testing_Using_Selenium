package Testcases;

import Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSelectCatagory extends utilities.DriverSetup {
   HomePage homePage=new HomePage();

   @BeforeMethod
    public void VisitPage(){
        homePage.loadHomePage();

    }

    @Test
    public void TestselectGeneralBookButton(){
       homePage.clickOnElement(homePage.GeneralBook);
    }

    @Test
    public void TestselectFreeBooks(){
        homePage.clickOnElement(homePage.freeBOOK);
    }
    @Test
    public void TestselectSelectprophetsahaba(){
        homePage.clickOnElement(homePage.nobijiboni);
    }

    @Test
    public void TestselectSelectIslamiWoman(){
        homePage.clickOnElement(homePage.islamibook);
    }

    @Test
    public void TestselectSelectibadat(){
        homePage.clickOnElement(homePage.Selfpurification);
    }



}
