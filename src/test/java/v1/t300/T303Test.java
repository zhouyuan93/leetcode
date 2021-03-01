package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T303Test {
    T303 t;

    @BeforeEach
    void setUp() {
        t = new T303();
    }

    @Test
    void test_1() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        T303.NumArray n = new T303.NumArray(nums);
        int actual = n.sumRange(1, 3);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        T303.NumArray n = new T303.NumArray(nums);
        int actual = n.sumRange(0, 3);
        int expected = 4;
        assertEquals(expected, actual);
    }
}