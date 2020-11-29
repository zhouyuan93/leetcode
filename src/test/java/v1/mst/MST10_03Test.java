package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST10_03Test {

    MST10_03 t;

    @BeforeEach
    void setUp() {
        t = new MST10_03();
    }

    @Test
    void test_1() {
        int[] nums = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int target = 5;
        int actual = t.search(nums, target);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int target = 11;
        int actual = t.search(nums, target);
        int expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {1,1,1,1,1,2,1,1,1};
        int target = 2;
        int actual = t.search(nums, target);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = {5,5,5,1,2,3,4,5};
        int target = 5;
        int actual = t.search(nums, target);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] nums = {21, 21, -21, -20, -17, -8, -6, -2, -2, -1, 0, 2, 3, 4, 4, 6, 11, 13, 14, 16, 17, 18, 20};
        int target = 4;
        int actual = t.search(nums, target);
        int expected = 13;
        assertEquals(expected,actual);
    }
}