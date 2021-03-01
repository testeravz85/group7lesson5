package test.java.po;

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

    public HomePage open(){
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.elementToBeClickable(searchFieldLocator)).click();
        return this;
    }

//    public HomePage insertTextInSearchField(){
//        driver.findElement(searchFieldLocator).sendKeys("Iphone\n");
//        return this;
//    }

}
