package test.java.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class homework2 extends TestBaseSetup {

    By signInLocator = By.xpath("//*[@class = 'nav-a nav-a-2   nav-progressive-attribute'][1]");
    By createLocator = By.id("createAccountSubmit");
    By submitCreateLocator = By.id("continue");
    By nameInputLocator = By.id("ap_customer_name");

    @Test
    public void checkSignInColorBodyEmpty() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //By signInLocator = By.id("nav-list-accountList");
        driver.findElement(signInLocator).click();
        driver.findElement(createLocator).click();
        driver.findElement(submitCreateLocator).click();
        Thread.sleep(5000);
        WebElement nameForm = driver.findElement(nameInputLocator);
        String expectedColor = "rgb(221, 0, 0)";
        String actualColor = nameForm.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
    }
}
