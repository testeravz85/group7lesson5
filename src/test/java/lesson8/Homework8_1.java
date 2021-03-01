package test.java.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class Homework8_1 extends TestBaseSetup {

    By signInLocator = By.xpath("//*[@class = 'nav-a nav-a-2   nav-progressive-attribute'][1]");
    By createLocator = By.id("createAccountSubmit");
    By submitCreateLocator = By.id("continue");
    By nameInputLocator = By.id("ap_customer_name");
    By emailInputLocator = By.id("ap_email");
    By passwordInputLocator = By.id("ap_password");
    String expectedColor = "rgb(221, 0, 0)";

    @BeforeMethod
    public void setUp() {
        driver.get("https://www.amazon.com/");
        driver.findElement(signInLocator).click();
        driver.findElement(createLocator).click();
    }

    @Test
    public void checkSignInColorBodyEmptyName() throws InterruptedException {
        WebElement nameForm = driver.findElement(nameInputLocator);
        driver.findElement(submitCreateLocator).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(nameInputLocator));
        String actualColor = nameForm.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
        //driver.quit();
    }

    @Test
    public void checkSignInColorBodyEmptyEmail() {
        WebElement emailForm = driver.findElement(emailInputLocator);
        driver.findElement(submitCreateLocator).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(nameInputLocator));
        //driver.findElement(emailInputLocator).getCssValue("border-color");
        String actualColor = emailForm.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
        //driver.quit();

    }

    @Test
    public void checkSignInColorBodyEmptyPassword() {
        WebElement passwordForm = driver.findElement(passwordInputLocator);
        driver.findElement(submitCreateLocator).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(nameInputLocator));
        String actualColor = passwordForm.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
        //driver.quit();
    }

//    public void checkSignInColorBodyEmptyPassword(By locator) {
//        WebElement element = driver.findElement(locator);
//        driver.findElement(submitCreateLocator).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(nameInputLocator));
//        String actualColor = element.getCssValue("border-color");
//        assertEquals(actualColor, expectedColor);
//    }
}
