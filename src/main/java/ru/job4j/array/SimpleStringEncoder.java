package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                counter++;
            } else {
                result = counter == 1 ? result + input.charAt(i - 1) : result + input.charAt(i - 1) + counter;
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        result = counter == 1 ? result + symbol : result + symbol + counter;
        return result;
    }
}
