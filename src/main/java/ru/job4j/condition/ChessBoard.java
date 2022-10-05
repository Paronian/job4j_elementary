package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {

        int rsl = (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)
                && (x1 != x2)
                && Math.abs(x2 - x1) == Math.abs(y2 - y1)) ? Math.abs(y2 - y1) : 0;
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(way(6, 7, 1, 2));
    }
}
