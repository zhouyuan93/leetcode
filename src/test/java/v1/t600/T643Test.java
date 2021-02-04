package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T643Test {

    T643 t;

    @BeforeEach
    void setUp() {
        t = new T643();
    }

    @Test
    void test_1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double actual = t.findMaxAverage(nums, k);
        double expected = 12.75;
        assertTrue(Math.abs(expected-actual) < 0.0000001);
    }

    @Test
    void test_2() {
        int[] nums = {-1};
        int k = 1;
        double actual = t.findMaxAverage(nums, k);
        double expected = -1;
        assertTrue(Math.abs(expected-actual) < 0.0000001);
    }
}