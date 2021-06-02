package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T523Test {

    T523 t;

    @BeforeEach
    void setUp() {
        t = new T523();
    }

    @Test
    void test_1() {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        boolean actual = t.checkSubarraySum(nums, k);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[] nums = {1,0};
        int k = 6;
        boolean actual = t.checkSubarraySum(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        boolean actual = t.checkSubarraySum(nums, k);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 13;
        boolean actual = t.checkSubarraySum(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void test_5() {
        int[] nums = {23, 2, 4, 6, 6};
        int k = 7;
        boolean actual = t.checkSubarraySum(nums, k);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}