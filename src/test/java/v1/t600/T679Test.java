package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T679Test {

    T679 t;

    @BeforeEach
    void setUp() {
        t = new T679();
    }

    @Test
    void test_1() {
        int[] nums = {4, 1, 8, 7};
        boolean actual = t.judgePoint24(nums);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1, 2, 1, 2};
        boolean actual = t.judgePoint24(nums);
        boolean expect = false;
        assertEquals(expect, actual);
    }
}