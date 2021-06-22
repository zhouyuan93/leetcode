package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ39Test {

    JZ39 t;

    @BeforeEach
    void setUp() {
        t = new JZ39();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int actual = t.majorityElement(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {Integer.MIN_VALUE};
        int actual = t.majorityElement(nums);
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, actual);
    }
}