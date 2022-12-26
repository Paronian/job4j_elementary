package ru.job4j.loop;

public class Mortgage {
    public static int calcDebt(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount * (1 + percent * 0.01) - salary;
            year++;
        }
        return year;
    }
}







