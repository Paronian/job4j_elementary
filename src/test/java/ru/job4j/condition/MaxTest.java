package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To2Then2() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To2And4Then10() {
        int one = 10;
        int two = 2;
        int three = 4;
        int result = Max.max(one, two, three);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To5And10Then10() {
        int one = 1;
        int two = 5;
        int three = 10;
        int result = Max.max(one, two, three);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To10And10Then10() {
        int one = 10;
        int two = 10;
        int three = 10;
        int result = Max.max(one, two, three);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To2And4And8Then10() {
        int one = 10;
        int two = 2;
        int three = 4;
        int four = 8;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To10And4And8Then10() {
        int one = 2;
        int two = 10;
        int three = 4;
        int four = 8;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To5And10And8Then10() {
        int one = 2;
        int two = 5;
        int three = 10;
        int four = 8;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To5And8And10Then10() {
        int one = 2;
        int two = 5;
        int three = 8;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To10And10And10Then10() {
        int one = 10;
        int two = 10;
        int three = 10;
        int four = 10;
        int result = Max.max(one, two, three, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}