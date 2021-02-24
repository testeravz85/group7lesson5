package test.java.lesson8;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import test.java.TestBaseSetup;

import java.util.concurrent.TimeUnit;

public class iphone extends TestBaseSetup {
    By inputLocator = By.id("twotabsearchtextbox");
    By searchBtnLocator = By.id("nav-search-submit-button");
    By minInputLocator = By.xpath("//input[@placeholder='Min']");
    By maxInputLocator = By.xpath("//input[@placeholder='Max']");
    By goBtnLocator = By.cssSelector("div[data-component-type='s-search-result']");
    By priceLocator = By.cssSelector(".a-price span[aria-hidden='true']");
    By flagLocator = By.id("\"icp-nav-flyout\"");
    By enOptionLocator = By.xpath("\"//span[text()='English - EN']\"");
    By deutshOptionLocator = By.xpath("\"//span[text()='Deutsch - DE']\"");
    By languagePopup = By.id("\"nav-flyout-icp\"");
    By todaysDeal = By.xpath("\"//a[text()=\\\"Today's Deals\\\"]\"");
    By checkboxDevicesLocator = By.xpath("\"//input[@type='checkbox' and following-sibling::span[contains(text(),'Devices')]]\"");
    By logoLocator = By.id("\"nav-logo-sprites\"");
    By locationPopupCancelLocator = By.xpath("\"//input[@type='submit' and following-sibling::span[contains(text(),\\\"Don't Change\\\")]]\"");

    @BeforeMethod
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//


    }


}
