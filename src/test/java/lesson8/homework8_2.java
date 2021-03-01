package test.java.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;

import static org.testng.Assert.assertEquals;

public class homework8_2 extends TestBaseSetup {

    By signInLocator = By.xpath("//*[@class = 'nav-a nav-a-2   nav-progressive-attribute'][1]");
    By createLocator = By.id("createAccountSubmit");
    By submitCreateLocator = By.id("continue");
    By nameInputLocator = By.id("ap_customer_name");
    By emailInputLocator = By.id("ap_email");
    By passwordInputLocator = By.id("ap_password");
    By passwordRepeatLocator = By.id("ap_password_check");
    String expectedRedColor = "rgb(221, 0, 0)";
    String expectedGreyColor = "rgba(148, 148, 148, 1)";

    @BeforeMethod
    public void setUp() {
        driver.get("https://www.amazon.com/");
        driver.findElement(signInLocator).click();
        driver.findElement(createLocator).click();
    }

    @Test
    public void checkSigInColorBodyFilledName() throws InterruptedException {
        WebElement insertName = driver.findElement(nameInputLocator);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(nameInputLocator));
        insertName.sendKeys("Alexandra");
        driver.findElement(submitCreateLocator).click();
        wait.until(ExpectedConditions.elementToBeClickable(emailInputLocator));
        String actualColor = insertName.getCssValue("border-top-color");
        assertEquals(actualColor, expectedGreyColor);
        driver.quit();
    }

    @Test
    public void checkSigInColorBodyFilledEmail() throws InterruptedException {
        WebElement insertEmail = driver.findElement(emailInputLocator);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(emailInputLocator)).click();
        insertEmail.sendKeys("shuro4ka28@gmail.com");
        //wait.until(ExpectedConditions.elementToBeClickable(submitCreateLocator));
        driver.findElement(submitCreateLocator).click();
        wait.until(ExpectedConditions.elementToBeClickable(nameInputLocator));
        String actualColor = insertEmail.getCssValue("border-top-color");
        assertEquals(actualColor, expectedGreyColor);
        driver.quit();
    }

    @Test
    public void checkSigInColorBodyFilledPassword() throws InterruptedException {
        WebElement insertPassword = driver.findElement(passwordInputLocator);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputLocator)).click();
        insertPassword.sendKeys("shuro4ka28@gmail.com");
        //wait.until(ExpectedConditions.elementToBeClickable(submitCreateLocator));
        driver.findElement(submitCreateLocator).click();
        wait.until(ExpectedConditions.elementToBeClickable(nameInputLocator));
        String actualColor = insertPassword.getCssValue("border-top-color");
        assertEquals(actualColor, expectedGreyColor);

        WebElement passwordRepeat = driver.findElement(passwordRepeatLocator);
        String actualColor1 = passwordRepeat.getCssValue("border-color");
        assertEquals(actualColor1, expectedRedColor);

        driver.quit();
    }
}
