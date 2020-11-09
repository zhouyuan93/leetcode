package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T414Test {
    T414 t;

    @BeforeEach
    void setUp() {
        t = new T414();
    }

    @Test
    void test_1() {
        int[] nums = {2, 2, 3, 1};
        int actual = t.thirdMax(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {2, 3, 2, 2, 2};
        int actual = t.thirdMax(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }
}