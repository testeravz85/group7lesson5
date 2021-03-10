package test.java.lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;

import java.util.List;
import java.util.Locale;

import static org.testng.Assert.assertTrue;

public class C_homework extends TestBaseSetup {
    By searchFieldLocator = By.id("twotabsearchtextbox");
    By searchBtnLocator = By.id("nav-search-submit-button");
    By searchResultLocator = By.cssSelector("div[data-component-type='s-search-result");
    String xpathFormat = "//*[@id='p_89/%s']//i";

    @BeforeMethod
    public void setUp() {
        driver.get("https://www.amazon.com/");
    }

    @Test(dataProvider = "brandProvider")
    public void SearchLaptopByBrand(String brand) {

        driver.findElement(searchFieldLocator).sendKeys("Laptop");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchBtnLocator)).click();

        String xpath = String.format(xpathFormat, brand);

        By checkBoxLocator = By.xpath(xpath);
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxLocator)).click();

        By itemText = By.cssSelector("div[class = 'a-section a-spacing-medium'] h2 span");
        List<WebElement> list = driver.findElements(itemText);
        for (WebElement element : list) {
            assertTrue(element.getText().toLowerCase(Locale.ROOT).contains(brand.toLowerCase(Locale.ROOT)));
        }
    }

    @DataProvider(name = "brandProvider")
    public Object[][] dp() {
        return new Object[][]{
                {"HP"},
                {"Acer"},
                {"Lenovo"},
                {"ASUS"},
                {"Dell"},
                {"Microsoft"},
                {"Apple"},
        };
    }
}
