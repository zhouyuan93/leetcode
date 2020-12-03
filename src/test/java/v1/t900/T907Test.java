package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T907Test {

    T907 t;

    @BeforeEach
    void setUp() {
        t = new T907();
    }

    @Test
    void test_1() {
        int[] nums = {3, 1, 2, 4};
        int actual = t.sumSubarrayMins(nums);
        int expected = 17;
        assertEquals(expected, actual);
    }
}