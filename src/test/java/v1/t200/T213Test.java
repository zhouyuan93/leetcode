package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T213Test {
    T213 t;

    @BeforeEach
    void setUp() {
        t = new T213();
    }

    @Test
    void test_1() {
        int[] nums = {2, 3, 2};
        int actual = t.rob(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,3,1};
        int actual = t.rob(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = {0};
        int actual = t.rob(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }
}