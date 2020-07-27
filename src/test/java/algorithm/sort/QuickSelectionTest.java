package algorithm.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectionTest {
    @Test
    void test_adjustArray_when_given_one_array_1() {
        int[] nums = {5, 2, 1, 7, 3, 8, 4, 6};
        int targetLocation = QuickSelection.adjustArray(nums, 0, nums.length - 1);

        int[] expect = {2, 1, 4, 3, 5, 8, 6, 7};

        assertArrayEquals(expect, nums);
        assertEquals(4, targetLocation);

    }

    @Test
    void test_adjustArray_when_given_one_array_2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int targetLocation = QuickSelection.adjustArray(nums, 0, nums.length - 1);

        int[] expect = {1, 3, 4, 5, 6, 7, 8, 2};

        assertArrayEquals(expect, nums);
        assertEquals(0, targetLocation);

    }

    @Test
    void test_adjustArray_when_given_one_array_3() {
        int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};
        int targetLocation = QuickSelection.adjustArray(nums, 0, nums.length - 1);

        int[] expect = {7, 6, 5, 4, 3, 2, 1, 8};

        assertArrayEquals(expect, nums);
        assertEquals(7, targetLocation);

    }

    @Test
    void test_quickSelection_when_given_one_array_1() {
        int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};

        double actual = QuickSelection.getMedian(nums);

        double except = 4.5;

        assertEquals(except, actual);
    }

    @Test
    void test_quickSelection_when_given_one_array_2() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        double actual = QuickSelection.getMedian(nums);

        double except = 4.5;

        assertEquals(except, actual);

    }

    @Test
    void test_quickSelection_when_given_one_array_3() {
        int[] nums = {6, 2, 1, 4, 3, 8, 7, 5};

        double actual = QuickSelection.getMedian(nums);

        double except = 4.5;

        assertEquals(except, actual);

    }

    @Test
    void test_quickSelection_when_given_one_array_4() {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        double actual = QuickSelection.getMedian(nums);

        double except = 5;

        assertEquals(except, actual);
    }

    @Test
    void test_quickSelection_when_given_one_array_5() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double actual = QuickSelection.getMedian(nums);

        double except = 5;

        assertEquals(except, actual);

    }

    @Test
    void test_quickSelection_when_given_one_array_6() {
        int[] nums = {6, 2, 1, 9, 4, 3, 8, 7, 5};

        double actual = QuickSelection.getMedian(nums);

        double except = 5;

        assertEquals(except, actual);

    }
}