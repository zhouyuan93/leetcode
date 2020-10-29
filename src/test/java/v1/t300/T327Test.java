package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T327Test {

    T327 t;

    @BeforeEach
    void setUp() {
        t = new T327();
    }

    @Test
    void test_1() {
        int[] nums = {-2, 5, -1};
        int lower = -2;
        int upper = 2;
        int actual = t.countRangeSum(nums, lower, upper);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {-2147483647,0,-2147483647,2147483647};
        int lower = -564;
        int upper = 3864;
        int actual = t.countRangeSum(nums, lower, upper);
        int expected = 3;
        assertEquals(expected,actual);
    }
}