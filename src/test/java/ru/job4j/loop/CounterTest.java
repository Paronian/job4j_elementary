package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTwelveToTwentyTwoOneHundredTwo() {
        int start = 12;
        int finish = 22;
        int result = Counter.sumByEven(start, finish);
        int expected = 102;
        assertThat(result).isEqualTo(expected);
    }
}