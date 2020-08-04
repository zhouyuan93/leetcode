package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t100.T198;

import static org.junit.jupiter.api.Assertions.*;

class T198Test {
    T198 t;

    @BeforeEach
    void setUp() {
        t = new T198();
    }

    @Test
    void test_2() {
        int[] nums = {2, 7, 9, 3, 1};
        int actual = t.rob(nums);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 1};
        int actual = t.rob(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }
}