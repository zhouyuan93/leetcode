package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T747Test {

    T747 t;

    @BeforeEach
    void setUp() {
        t = new T747();
    }

    @Test
    void test_1() {
        int[] nums = {3, 6, 1, 0};
        int actual = t.dominantIndex(nums);
        int expect = 1;
        assertEquals(expect, actual);
    }
    @Test
    void test_2() {
        int[] nums = {4, 6, 1, 0};
        int actual = t.dominantIndex(nums);
        int expect = -1;
        assertEquals(expect, actual);
    }
    @Test
    void test_3() {
        int[] nums = {0,0,3,2};
        int actual = t.dominantIndex(nums);
        int expect = -1;
        assertEquals(expect, actual);
    }
}