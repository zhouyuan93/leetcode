package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t200.T287;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T287Test {

    T287 t;

    @BeforeEach
    void setUp() {
        t = new T287();
    }

    @Test
    void test_1() {
        int[] nums = {3, 1, 3, 4, 2};
        int actual = t.findDuplicate(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {2, 1, 3, 4, 2, 4, 5, 6, 7};
        int actual = t.findDuplicate(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        int[] nums = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        int actual = t.findDuplicate(nums);
        int expected = 9;
        assertEquals(expected, actual);
    }
}