package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1437Test {

    T1437 t;

    @BeforeEach
    void setUp() {
        t = new T1437();
    }

    @Test
    void test_1() {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
        boolean actual = t.kLengthApart(nums, k);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 4;
        boolean actual = t.kLengthApart(nums, k);
        boolean expect = false;
        assertEquals(expect, actual);
    }
}