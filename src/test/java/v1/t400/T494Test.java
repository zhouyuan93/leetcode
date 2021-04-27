package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T494Test {

    T494 t;

    @BeforeEach
    void setUp() {
        t = new T494();
    }

    @Test
    void test_1() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int actual = t.findTargetSumWays(nums, target);
        int expected = 5;
        assertEquals(expected, actual);
    }
}