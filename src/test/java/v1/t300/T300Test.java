package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T300Test {

    T300 t;

    @BeforeEach
    void setUp() {
        t = new T300();
    }

    @Test
    void test_1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int actual = t.lengthOfLIS(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {7, 7, 7,};
        int actual = t.lengthOfLIS(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }
}