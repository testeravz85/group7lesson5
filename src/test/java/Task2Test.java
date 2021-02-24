package test.java;

import main.java.Task2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2Test {

    @Test()
    public void testStringMethod() {
        Task2 matrixMaker = new Task2();
        String matrix = matrixMaker.someMethod();

        String[] lines = matrix.split("\n");
        assertEquals(lines.length, 5);

        String[] words = lines[0].split(" ");
        assertEquals(words.length, 10);

    }
}
