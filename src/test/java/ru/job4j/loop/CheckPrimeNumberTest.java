package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckPrimeNumberTest {

    @Test
    public void when5()  {
        int number = 5;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isTrue();
    }

    @Test
    public void when4() {
        int number = 4;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isFalse();
    }

    @Test
    public void when1() {
        int number = 1;
        boolean rsl = CheckPrimeNumber.check(number);
        assertThat(rsl).isTrue();
    }
}