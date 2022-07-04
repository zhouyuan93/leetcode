package v1.t2100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2163Test {

    T2163 t;

    @BeforeEach
    void setUp() {
        t = new T2163();
    }

    @Test
    void test_1() {
        int[] nums = {3, 1, 2};
        long actual = t.minimumDifference(nums);
        long expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {7, 9, 5, 8, 1, 3};
        long actual = t.minimumDifference(nums);
        long expected = 1;
        assertEquals(expected, actual);
    }
}