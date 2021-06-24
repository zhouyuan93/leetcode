package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T149Test {
    T149 t;

    @BeforeEach
    void setUp() {
        t = new T149();
    }

    @Test
    void test_1() {
        int[][] points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        int actual = t.maxPoints(points);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[][] points = {{0,0},{4,5},{7,8},{8,9},{5,6},{3,4},{1,1}};
        int actual = t.maxPoints(points);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[][] points = {{2,3},{3,3},{-5,3}};
        int actual = t.maxPoints(points);
        int expected = 3;
        assertEquals(expected,actual);
    }
}