package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T704Test {

    T704 t;

    @BeforeEach
    void setUp() {
        t = new T704();
    }

    @Test
    void test_1() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int actual = t.search(nums, target);
        int expect = 4;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int actual = t.search(nums, target);
        int expect = -1;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int[] nums = {5};
        int target = 5;
        int actual = t.search(nums, target);
        int expect = 0;
        assertEquals(expect, actual);
    }
}