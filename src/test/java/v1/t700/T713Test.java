package v1.t700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T713Test {

    T713 t = new T713();

    @Test
    void test_1() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int actual = t.numSubarrayProductLessThanK(nums, k);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,3};
        int k = 0;
        int actual = t.numSubarrayProductLessThanK(nums, k);
        int expected = 0;
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        int[] nums = {1,1,1,1,1};
        int k = 2;
        int actual = t.numSubarrayProductLessThanK(nums, k);
        int expected = 5 + 4 + 3 + 2 + 1;
        assertEquals(expected,actual);
    }
}