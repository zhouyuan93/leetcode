package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T547Test {

    T547 t;

    @BeforeEach
    void setUp() {
        t = new T547();
    }

    @Test
    void test_1() {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int actual = t.findCircleNum(isConnected);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int actual = t.findCircleNum(isConnected);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[][] isConnected = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        int actual = t.findCircleNum(isConnected);
        int expected = 1;
        assertEquals(expected, actual);
    }
}