package test.java.lesson9;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;
import test.java.helpers.RetryAnalyzer;
import test.java.po.BasePage;
import test.java.po.HomePage;
import test.java.po.SearchresultPage;


import java.util.Locale;

import static org.testng.Assert.assertTrue;


public class homework_9 extends TestBaseSetup {
    HomePage homePage;
    SearchresultPage searchresultPage;
    private final Logger logger = LogManager.getLogger(homework_9.class);
    public String dataProvider;

    @BeforeMethod
    public void setUp() {
        HomePage homePage = new HomePage(driver);
        searchresultPage = new SearchresultPage(driver);
    }

    @Test()
    public void searchGoods(String brand1, String brand2) {

        HomePage homePage = new HomePage(driver);
        homePage
                .open()
                .setSearch(brand1);

        String actualResult = searchresultPage
                .goToResultPage()
                .getResultOfSearch();
        try {
            assertTrue(actualResult.toLowerCase(Locale.ROOT).contains(brand1.toLowerCase(Locale.ROOT)));
            //assertTrue(false);
        } catch (AssertionError e) {
            logger.warn("Test failed. Message: " + e.getMessage());
            throw e;
        }
        searchresultPage
                .setSearch(brand2);


        String actualResult1 = searchresultPage
                .goToResultPage()
                .getResultOfSearch();

        try {
            assertTrue(actualResult1.toLowerCase(Locale.ROOT).contains(brand2.toLowerCase(Locale.ROOT)));
        } catch (AssertionError e) {
            logger.error("Test failed. Message: " + e.getMessage());
            throw e;
        }
    }
}

