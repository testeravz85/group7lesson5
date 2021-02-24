package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
    public void afterMethod() {
        driver.quit();
    }
}
