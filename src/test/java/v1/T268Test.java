package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T268;

import static org.junit.jupiter.api.Assertions.*;

class T268Test {
    T268 t;

    @BeforeEach
    void setUp() {
        t = new T268();
    }

    @Test
    void test_1() {
        int[] nums = {3, 0, 1};
        int actual = t.missingNumber(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }
}