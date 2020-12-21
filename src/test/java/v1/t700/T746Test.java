package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T746Test {

    T746 t;

    @BeforeEach
    void setUp() {
        t = new T746();
    }

    @Test
    void test_1() {
        int[] cost = new int[]{10, 15, 20};
        int actual = t.minCostClimbingStairs(cost);
        int expected = 15;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int actual = t.minCostClimbingStairs(cost);
        int expected = 6;
        assertEquals(expected,actual);
    }
}