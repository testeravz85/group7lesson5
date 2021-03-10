package test.java.po;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Locale;

import static org.testng.Assert.assertTrue;

public class SearchresultPage extends BasePage {
    Logger logger = LogManager.getLogger(SearchresultPage.class);


    public SearchresultPage(WebDriver driver) {
        super(driver);
        logger.debug("Initialized Search page");
    }

    @Override
    public BasePage open() {
        driver.get("");
        return this;
    }

    public SearchresultPage goToResultPage() {
        wait.until(driver -> driver.findElements(searchResultLocator).size() >= 3);
        return this;
    }

    public String getResultOfSearch() {
        logger.info("Get Results of Search");

        return driver
                .findElement(inputText)
                .getText();
    }
}

