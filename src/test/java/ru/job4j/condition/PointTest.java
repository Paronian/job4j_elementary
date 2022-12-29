package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to416then12() {
        double expected = 12;
        Point a = new Point(4, 4);
        Point b = new Point(4, 16);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to222then3Dot46() {
        double expected = 3.46;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to666then10Dot39() {
        double expected = 10.39;
        Point a = new Point(0, 0, 0);
        Point b = new Point(6, 6, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
