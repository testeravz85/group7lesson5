package test.java;

import main.java.Task5;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task5Test {
    @Test(dataProvider = "wordProvider")
    public void testReverse(String word) {
        Task5 reverser = new Task5();

        String actualValue = reverser.reverse(word);
        String expectedValue = new StringBuilder(word).reverse().toString();

        assertEquals(actualValue, expectedValue);
    }

    @DataProvider(name = "wordProvider")
    public Object[][] dp() {
        return new Object[][]{
                {"Hello Vladimir"},
                {"123 456 78908"},
        };
    }

}
