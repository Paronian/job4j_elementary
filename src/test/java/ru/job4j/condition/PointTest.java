package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.calcDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double out = Point.calcDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.calcDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to416then12() {
        double expected = 12;
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 16;
        double out = Point.calcDistance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}