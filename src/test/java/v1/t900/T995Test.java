package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T995Test {

    T995 t;

    @BeforeEach
    void setUp() {
        t = new T995();
    }

    @Test
    void test_1() {
        int[] nums = {0, 1, 0};
        int k = 1;
        int actual = t.minKBitFlips(nums, k);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,1,0};
        int k = 2;
        int actual = t.minKBitFlips(nums, k);
        int expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {0,0,0,1,0,1,1,0};
        int k = 3;
        int actual = t.minKBitFlips(nums, k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = {0,1,0,1,0,1,1,1,1};
        int k = 3;
        int actual = t.minKBitFlips(nums, k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] nums = {0,1,1,1,0,0,0};
        int k = 2;
        int actual = t.minKBitFlips(nums, k);
        int expected = 5;
        assertEquals(expected,actual);
    }
}