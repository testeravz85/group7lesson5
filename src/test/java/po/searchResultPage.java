package test.java.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchResultPage extends BasePage {

    protected searchResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage open() {
        driver.get("");
        return this;
    }

    public String getResultOfSearch(){
        return driver
                .findElement(IphoneLocator)
                .getText();
    }


}

