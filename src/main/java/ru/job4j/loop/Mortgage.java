package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        while (amount * (1 + percent * 0.01) - salary > 0) {
            amount = amount * (1 + percent * 0.01) - salary;
            year++;
        }
        return year;
    }
}
