package test.java.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class homeworkWebDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver();

        By todayDealsBtnLocator = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
        By priceLocator = By.xpath("//div[@class = 'a-row priceBlock unitLineHeight']");

        //driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(todayDealsBtnLocator).click();

        WebElement price = driver.findElement(priceLocator);
        String text = price.getText();
        //text = "$349.99 - $559.98"; prices to check conditions of test

        if (text.indexOf('-') == -1) {
            System.out.printf("Price is:'%s'%n", text);
        } else {
            String[] prices = text.split(" - ");
            System.out.printf("Minimum price:'%s'%n", prices[0].replace("$", ""));
            System.out.printf("maximum price:'%s'%n", prices[1].replace("$", ""));
            String minPrice = prices[0];
            String maxPrice = prices[1];
        }
        driver.quit();
    }
}
