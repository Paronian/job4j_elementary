package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP30K14Square14() {
        int expected = 14;
        int p = 30;
        double k = 14;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP60K14Square56() {
        int expected = 56;
        int p = 60;
        double k = 14;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

}