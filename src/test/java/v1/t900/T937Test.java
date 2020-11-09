package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T937Test {

    T937 t;

    @BeforeEach
    void setUp() {
        t = new T937();
    }

    @Test
    void test_1() {
        int[][] points = {{1,3},{-2,2}};
        int K = 1;
        int[][] actual = t.kClosest(points, K);
        int[][] expected = {{-2,2}};
        assertArrayEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[][] points = {{1,3},{-2,2},{-3,-3}};
        int K = 1;
        int[][] actual = t.kClosest(points, K);
        int[][] expected = {{-2,2}};
        assertArrayEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int K = 2;
        int[][] actual = t.kClosest(points, K);
        int[][] expected = {{3,3},{-2,4}};
        assertArrayEquals(expected,actual);
    }
}