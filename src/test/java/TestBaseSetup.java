package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.java.helpers.Screenshot;

public class TestBaseSetup {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--windows size=1300,1000");
        driver = new ChromeDriver(chromeOptions);
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
       Screenshot screenshot = new Screenshot(driver);
       screenshot.makeScreenshot(testResult);
        driver.quit();

    }
}
