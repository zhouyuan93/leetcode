package algorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void test_adjustArray_when_gaven_one_array_1() {
        int[] nums = {5, 2, 1, 7, 3, 8, 4, 6};
        int targetLocation = QuickSort.adjustArray(nums, 0, nums.length - 1);

        int[] expect = {2, 1, 4, 3, 5, 8, 6, 7};

        assertArrayEquals(expect, nums);
        assertEquals(4, targetLocation);

    }

    @Test
    void test_adjustArray_when_gaven_one_array_2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int targetLocation = QuickSort.adjustArray(nums, 0, nums.length - 1);

        int[] expect = {1, 3, 4, 5, 6, 7, 8, 2};

        assertArrayEquals(expect, nums);
        assertEquals(0, targetLocation);

    }

    @Test
    void test_adjustArray_when_gaven_one_array_3() {
        int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};
        int targetLocation = QuickSort.adjustArray(nums, 0, nums.length - 1);

        int[] expect = {7, 6, 5, 4, 3, 2, 1, 8};

        assertArrayEquals(expect, nums);
        assertEquals(7, targetLocation);

    }

    @Test
    void test_quickSort_when_gaven_one_array_1() {
        int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};

        QuickSort.run(nums);

        int[] expect = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expect);

        assertArrayEquals(expect, nums);

    }

    @Test
    void test_quickSort_when_gaven_one_array_2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        QuickSort.run(nums);

        int[] expect = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expect);

        assertArrayEquals(expect, nums);

    }

    @Test
    void test_quickSort_when_gaven_one_array_3() {
        int[] nums = {6,2,1,4,3,8,7,5};

        QuickSort.run(nums);

        int[] expect = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expect);

        assertArrayEquals(expect, nums);

    }
}