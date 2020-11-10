package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T31Test {
    T31 t;

    @BeforeEach
    void setUp() {
        t = new T31();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 3, 2};
        t.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test_2() {
        int[] nums = {3, 2, 1};
        int[] expected = {1, 2, 3};
        t.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test_3() {
        int[] nums = {1, 1, 5};
        int[] expected = {1, 5, 1};
        t.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test_4() {
        int[] nums = {1, 1, 5, 4, 3, 2, 2};
        int[] expected = {1, 2, 1, 2, 3, 4, 5};
        t.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void test_5() {
        int[] nums = {1, 2};
        int[] expected = {2,1};
        t.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }
    @Test
    void test_6() {
        int[] nums = {2,3,1};
        int[] expected = {3,1,2};
        t.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

}