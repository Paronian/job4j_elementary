package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] tempArray = new int[100];
        int delta = money - price;
        int i = 0;
        for (int index = 0; index < coins.length; index++) {
            if (delta == 0) {
                break;
            } else {
                while (delta - coins[index] >= 0) {
                    delta = delta - coins[index];
                    tempArray[i] = coins[index];
                    i++;
                }
            }
        }
        int[] result = Arrays.copyOf(tempArray, i);
        return result;
    }
}


