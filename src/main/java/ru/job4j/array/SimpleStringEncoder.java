package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        if (input.length() == 1) {
            return input;
        }
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i) && i == input.length() - 1) {
                counter++;
                return result + input.charAt(i) + counter;
            } else if (input.charAt(i - 1) == input.charAt(i)) {
                counter++;
            } else if (counter > 1 && i == input.length() - 1) {
                return result + input.charAt(i - 1) + counter + input.charAt(i);
            } else if (counter > 1) {
                result = result + input.charAt(i - 1) + counter;
                counter = 1;
            } else if (counter == 1 && i == input.length() - 1) {
                return result + input.charAt(i - 1) + input.charAt(i);
            } else {
                result = result + input.charAt(i - 1);
            }
        }
        return result;
    }
}
