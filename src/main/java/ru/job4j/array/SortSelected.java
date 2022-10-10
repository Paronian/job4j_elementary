package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int index = 0;
        for (int i = index; i < data.length; i++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int minIndex = FindLoop.indexInRange(data, min, index, data.length - 1);
            SwitchArray.swap(data, index, minIndex);
            index++;
        }
        return data;
    }
}
