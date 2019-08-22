package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T53;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T53Test {

    private T53 t;

    @BeforeEach
    void setUp() {
        this.t = new T53();
    }

    @Test
    void test_1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = t.maxSubArray(nums);
        assertEquals(6, res);
    }

    @Test
    void test_2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res = t.maxSubArray(nums);
        assertEquals(45, res);
    }

    @Test
    void test_3() {
        int[] nums = {100, -2, -3, -4, -5, -6, -7, -8, 9};
        int res = t.maxSubArray(nums);
        assertEquals(100, res);
    }
    @Test
    void test_4() {
        int[] nums = {-2,1};
        int res = t.maxSubArray(nums);
        assertEquals(1, res);
    }
}