package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int colomn) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][colomn] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }
}

