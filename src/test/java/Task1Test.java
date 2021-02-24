package test.java;

import main.java.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1Test {

    @Test(dataProvider = "numbersProvider")
    public void testMin(int a, int b, int c) {
        Task1 calculator = new Task1();

        int calculatedValue = calculator.get_min_number(a, b, c);
        int expectedValue = Math.min(a, Math.min(b, c));

        assertEquals(calculatedValue, expectedValue);
    }

    @DataProvider(name = "numbersProvider")
    public Object[][] dp() {
        return new Object[][] {
                {10, 100, 9},
                {-110, -100, 9},
                {10, -100, -900},
                {-100, -100, -100},
                {-100, -100, -900},
                {-900, -100, -900},
        };
    }
}
