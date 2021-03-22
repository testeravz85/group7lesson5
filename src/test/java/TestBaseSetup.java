package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBaseSetup {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod(ITestContext iTestContext) {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--windows size=1300,1000");
        FirefoxOptions ffOptions = new FirefoxOptions();

        System.out.println(System.getProperty("browser"));

        //driver = new ChromeDriver(chromeOptions)
        try {
        driver = new RemoteWebDriver(new URL("http://3.128.204.135:4444/wd/hub"),
        System.getProperty("browser").equals("chrome") ? chromeOptions : ffOptions
    );
        } catch (MalformedURLException e) {
           e.printStackTrace();
       }
        iTestContext.setAttribute("driver",driver);

    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
//       Screenshot screenshot = new Screenshot(driver);
//       screenshot.makeScreenshot(testResult);
        driver.quit();

    }
}
