package main.java;

public class Task1 {
    public int get_min_number(int a, int b, int c) {
        int min;

        if (a < b) {
            min = a;

        } else {
            min = b;
        }

        if (c < min) {
            min = c;
        }
        return min;
    }
}
