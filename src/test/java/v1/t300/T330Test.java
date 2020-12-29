package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T330Test {

    T330 t;

    @BeforeEach
    void setUp() {
        t = new T330();
    }

    @Test
    void test_1() {
        int[] nums = {1, 5, 10};
        int n = 20;
        int actual = t.minPatches(nums, n);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,2};
        int n = 5;
        int actual = t.minPatches(nums, n);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {1,3};
        int n = 6;
        int actual = t.minPatches(nums, n);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = {};
        int n = 8;
        int actual = t.minPatches(nums, n);
        int expected = 4;
        assertEquals(expected,actual);
    }
}