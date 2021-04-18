package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T698Test {
    T698 t;

    @BeforeEach
    void setUp() {
        t = new T698();
    }

    @Test
    void test_1() {
        int[] nums = { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,9};
        int k = 8;
        boolean actual = t.canPartitionKSubsets(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = { 2,2,2,2,2,2,2,2,2,2,2,2,2,3,3};
        int k = 8;
        boolean actual = t.canPartitionKSubsets(nums, k);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}