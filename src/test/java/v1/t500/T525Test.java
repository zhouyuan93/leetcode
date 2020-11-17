package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T525Test {
    T525 t;

    @BeforeEach
    void setUp() {
        t = new T525();
    }

    @Test
    void test_1() {
        int[] nums = {0, 1};
        int actual = t.findMaxLength(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {0, 1, 0};
        int actual = t.findMaxLength(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        int[] nums = {1,0,0,1,0,0,1};
        int actual = t.findMaxLength(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums = {1,1};
        int actual = t.findMaxLength(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }
}