package test.java.helpers;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "brands1")
    public Object[][] dp1() {
        return new Object[][]{
                {"Iphone", "Samsung"},
        };
    }

    @DataProvider(name = "brands2")
    public Object[][] dp2() {
        return new Object[][]{
                {"Asus", "Lenovo"},
        };
    }

    @DataProvider(name = "brands3")
    public Object[][] dp3() {
        return new Object[][]{
                {"Acer", "Lenovo"},
        };
    }
}
