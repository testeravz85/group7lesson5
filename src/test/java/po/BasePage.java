package test.java.po;


import net.bytebuddy.asm.Advice;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;
    protected final By searchFieldLocator = By.id("twotabsearchtextbox");
    protected final By inputText = By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']");
    By searchResultLocator = By.cssSelector("div[data-component-type='s-search-result']");
    private final Logger logger = LogManager.getLogger(BasePage.class);

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10,500);
    }

    abstract BasePage open();

    public BasePage setSearch(String search){
        logger.info(String.format("Set search '%s'", search));
        WebElement input = driver.findElement(searchFieldLocator);
        input.clear();
        input.sendKeys(search);
        input.sendKeys(Keys.ENTER);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultLocator));
        return this;
    }
}

