package main.java;

public class Task2 {
    public String someMethod() {
        String name = "Alexandra";
        String result = "";//added
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                result += name + " ";//was changed
            }
            result += "\n";
        }
        return result;
    }
}

