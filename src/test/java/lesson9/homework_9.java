package test.java.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.TestBaseSetup;
import test.java.po.HomePage;


public class homework_9 extends TestBaseSetup {
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        HomePage homePage = new HomePage(driver);
    }

    @Test
    public void searchIphoneGoods() {
        HomePage homePage = new HomePage(driver);
        homePage
                .open()
                //.insertTextInSearchField()
                .setSearch("Iphone")
                .setSearch("Samsung");
    }
}
