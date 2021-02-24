package test.java.lesson7;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A_Start_Browser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("start-maximized");
        //chromeOptions.addArguments("--incognito") open window in incognito

        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(500,500));

        //driver.get("https://www.amazon.com/");

        Thread.sleep(5000);

        driver.quit();

    }
}
