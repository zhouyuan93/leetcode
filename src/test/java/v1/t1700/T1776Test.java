package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1776Test {

    T1776 t;

    @BeforeEach
    void setUp() {
        t = new T1776();
    }

    @Test
    void test_1() {
        int[][] cars = {{1, 2}, {2, 1}, {4, 3}, {7, 2}};
        double[] actual = t.getCollisionTimes(cars);
        double[] expected = {1.00000, -1.00000, 3.00000, -1.00000};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] cars = {{3, 4}, {5, 4}, {6, 3}, {9, 1}};
        double[] actual = t.getCollisionTimes(cars);
        double[] expected = {2.0, 1.0, 1.5, -1.0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}