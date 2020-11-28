package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T493Test {

    T493 t;

    @BeforeEach
    void setUp() {
        t = new T493();
    }

    @Test
    void test_1() {
        int[] nums = {};
        int actual = t.reversePairs(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1, 3, 2, 3, 1};
        int actual = t.reversePairs(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = {2, 4, 3, 5, 1};
        int actual = t.reversePairs(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums = {2147483647, 2147483647, -2147483647, -2147483647, -2147483647, 2147483647};
        int actual = t.reversePairs(nums);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[] nums = {3,3,-2};
        int actual = t.reversePairs(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int[] nums = {2,4,3,5,1};
        int actual = t.reversePairs(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }
}