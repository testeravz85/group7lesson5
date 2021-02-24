package test.java.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;

import static org.testng.Assert.assertEquals;

public class homework2_2 extends TestBaseSetup {

    By signInLocator = By.xpath("//*[@class = 'nav-a nav-a-2   nav-progressive-attribute'][1]");
    By createLocator = By.id("createAccountSubmit");
    By submitCreateLocator = By.id("continue");
    By nameInputLocator = By.id("ap_customer_name");

    @Test
    public void checkSigInColorBodyFilled() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        driver.findElement(signInLocator).click();
        driver.findElement(createLocator).click();
        WebElement insertName = driver.findElement(nameInputLocator);
        String expectedColor = insertName.getCssValue("border-color");
        System.out.println(expectedColor);
        insertName.sendKeys("Alexandra");
        Thread.sleep(1000);
        driver.findElement(submitCreateLocator).click();
        String actualColor =insertName.getCssValue("border-color");
        assertEquals(actualColor,expectedColor);


    }
}
