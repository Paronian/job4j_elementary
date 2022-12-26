package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] temp = new int[100];
        int delta = money - price;
        int i = 0;
        for (int index = 0; index < coins.length; index++) {
            while (delta - coins[index] >= 0) {
                delta = delta - coins[index];
                temp[i] = coins[index];
                i++;
            }
        }
        return Arrays.copyOf(temp, i);
    }
}



