package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t100.T128;

import static org.junit.jupiter.api.Assertions.*;

class T128Test {
    T128 t;

    @BeforeEach
    void setUp() {
        t = new T128();
    }

    @Test
    void test_1() {
        int[] nums = {0, -1};
        int actual = t.longestConsecutive(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,0,1};
        int actual = t.longestConsecutive(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }
}