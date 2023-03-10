package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1590Test {

    T1590 t;

    @BeforeEach
    void setUp() {
        t = new T1590();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3};
        int p = 3;
        int actual = t.minSubarray(nums, p);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        int[] nums = {1, 2, 3};
        int p = 7;
        int actual = t.minSubarray(nums, p);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = {1111,1111,1111};
        int p = 3;
        int actual = t.minSubarray(nums, p);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums = {5,1,1,6,4};
        int p = 9;
        int actual = t.minSubarray(nums, p);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[] nums = {3,1,4,2};
        int p = 6;
        int actual = t.minSubarray(nums, p);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int[] nums = {4,5,8,5,4};
        int p = 7;
        int actual = t.minSubarray(nums, p);
        int expected = 1;
        assertEquals(expected, actual);
    }
}