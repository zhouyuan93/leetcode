package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T532Test {

    T532 t;

    @BeforeEach
    void setUp() {
        t = new T532();
    }

    @Test
    void test_1() {
        int[] nums = {3, 1, 4, 1, 5, 2};
        int k = 2;
        int actual = t.findPairs(nums, k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {3, 4, 1, 5, 2};
        int k = 2;
        int actual = t.findPairs(nums, k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {1, 3, 1, 5, 4};
        int k = 0;
        int actual = t.findPairs(nums, k);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = {1,1,1,2,2};
        int k = 2;
        int actual = t.findPairs(nums, k);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] nums = {1,1,1,1,1};
        int k = 0;
        int actual = t.findPairs(nums, k);
        int expected = 1;
        assertEquals(expected,actual);
    }
}