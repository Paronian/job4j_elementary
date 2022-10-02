package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "The original number is divisible by 6.";
        } else if (number % 3 == 0) {
            rsl = "The original number is divisible by 3, but is not even.";
        } else if (number % 2 == 0) {
            rsl = "The original number is not divisible by 3, but is even.";
        } else {
            rsl = "The original number is not divisible by 3 and is not even.";
        }
        return rsl;
    }
}
