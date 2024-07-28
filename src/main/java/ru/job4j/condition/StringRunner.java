package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        int year = 2022;
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie. ";
        idea += year;
        System.out.println(idea);

        int a = 'A';
        int b = 'B';
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("A + B: " + (a + b));

    }
}
