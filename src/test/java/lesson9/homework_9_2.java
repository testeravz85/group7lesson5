package test.java.lesson9;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;
import test.java.helpers.RetryAnalyzer;
import test.java.po.HomePage;
import test.java.po.SearchresultPage;

import java.util.Locale;

import static org.testng.Assert.assertTrue;


public class homework_9_2 extends TestBaseSetup {
    HomePage homePage;
    SearchresultPage searchresultPage;
    private final Logger logger = LogManager.getLogger(homework_9_2.class);

    @BeforeMethod
    public void setUp() {
        HomePage homePage = new HomePage(driver);
        searchresultPage = new SearchresultPage(driver);
    }

    @Test
    public void searchGoods() {
        HomePage homePage = new HomePage(driver);
        homePage
                .open()
                .setSearch("Iphone");

        String actualResult = searchresultPage
                .goToResultPage()
                .getResultOfSearch();
        try {
            assertTrue(actualResult.toLowerCase(Locale.ROOT).contains("Iphone".toLowerCase(Locale.ROOT)));
            //assertTrue(false);
        } catch (AssertionError e) {
            logger.warn("Test failed. Message: " + e.getMessage());
            throw e;
        }
    }
}
