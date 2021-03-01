package test.java.po;


import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;
    protected final By searchFieldLocator = By.id("twotabsearchtextbox");
    protected final By IphoneLocator = By.className("\"a-size-medium a-color-base a-text-normal\"");

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10,500);
    }

    abstract BasePage open();

    public BasePage setSearch(String search){
        WebElement input = driver.findElement(searchFieldLocator);
        input.sendKeys(search);
        input.sendKeys(Keys.ENTER);
        return this;
    }
}

