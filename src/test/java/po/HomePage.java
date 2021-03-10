package test.java.po;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage open(){
        logger.info("Open Home page");
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.elementToBeClickable(searchFieldLocator)).click();
        return this;
    }

}
