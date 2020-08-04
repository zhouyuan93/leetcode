package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t1200.T1287;

import static org.junit.jupiter.api.Assertions.*;

class T1287Test {
    T1287 t;

    @BeforeEach
    void setUp() {
        t = new T1287();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6};
        int actual = t.findSpecialInteger(nums);
        int expect = 5;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,2};
        int actual = t.findSpecialInteger(nums);
        int expect = 2;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int[] nums = {1};
        int actual = t.findSpecialInteger(nums);
        int expect = 1;
        assertEquals(expect, actual);
    }
}