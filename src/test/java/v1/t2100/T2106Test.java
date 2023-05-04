package v1.t2100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2106Test {

    T2106 t;

    @BeforeEach
    void setUp() {
        t = new T2106();
    }

    @Test
    void test_1() {
        int[][] fruits = {{2, 8}, {6, 3}, {8, 6}};
        int startPos = 5, k = 4;
        int actual = t.maxTotalFruits(fruits, startPos, k);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[][] fruits = {{0,9},{4,1},{5,7},{6,2},{7,4},{10,9}};
        int startPos = 5, k = 4;
        int actual = t.maxTotalFruits(fruits, startPos, k);
        int expected = 14;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[][] fruits = {{0,3},{6,4},{8,5}};
        int startPos = 3, k = 2;
        int actual = t.maxTotalFruits(fruits, startPos, k);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[][] fruits = {{0,10000}};
        int startPos = 20000, k = 20000;
        int actual = t.maxTotalFruits(fruits, startPos, k);
        int expected = 10000;
        assertEquals(expected,actual);
    }
}