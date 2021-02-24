package test.java;

import main.java.Task5Xml;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task5TestXml {
    @Parameters({"word"})
    @Test()
    public void testReverse(String word) {
        Task5Xml reverser = new Task5Xml();

        System.out.println(word);

        String actualValue = reverser.reverse(word);
        String expectedValue = new StringBuilder(word).reverse().toString();

        assertEquals(actualValue, expectedValue);
    }
}
