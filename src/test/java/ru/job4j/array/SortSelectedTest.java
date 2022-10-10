package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortOther() {
        int[] data = new int[] {1000, 0, 5, -300, 500};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-300, 0, 5, 500, 1000};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortOtherAndSameNumber() {
        int[] data = new int[] {3, 0, 7, 7, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 0, 3, 7, 7};
        assertThat(result).containsExactly(expected);
    }
}