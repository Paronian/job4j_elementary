package ru.job4j.condition;

public class PointEq {
    public static boolean check(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }

    public static void main(String[] args) {
        System.out.println(check(1, 1, 2, 2));
        System.out.println(check(10, 10, 10, 10));
    }
}
