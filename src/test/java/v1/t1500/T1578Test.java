package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1578Test {

    T1578 t;

    @BeforeEach
    void setUp() {
        t = new T1578();
    }

    @Test
    void test_1() {
        String s = "abaac";
        int[] cost = {1, 2, 3, 4, 5};
        int actual = t.minCost(s, cost);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "abc";
        int[] cost = {1,2,3};
        int actual = t.minCost(s, cost);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "aabaa";
        int[] cost = {1, 2, 3, 4, 1};
        int actual = t.minCost(s, cost);
        int expected = 2;
        assertEquals(expected, actual);
    }
}