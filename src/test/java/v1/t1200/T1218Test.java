package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1218Test {

    T1218 t;

    @BeforeEach
    void setUp() {
        t = new T1218();
    }

    @Test
    void test_1() {
        int[] arr = {1, 2, 3, 4};
        int actual = t.longestSubsequence(arr, 1);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] arr = {1,3,5,7};
        int actual = t.longestSubsequence(arr, 1);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] arr = {1,5,7,8,5,4,3,2,1};
        int actual = t.longestSubsequence(arr, -2);
        int expected = 4;
        assertEquals(expected,actual);
    }
}