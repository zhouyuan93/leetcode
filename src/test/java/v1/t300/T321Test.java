package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T321Test {

    T321 t;

    @BeforeEach
    void setUp() {
        t = new T321();
    }

    @Test
    void test_1() {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};
        int k = 5;
        int[] actual = t.maxNumber(nums1, nums2, k);
        System.out.println(Arrays.toString(actual));
        int[] expected = {9, 8, 6, 5, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums1 = {3, 1, 1, 9};
        int[] nums2 = {3, 9, 8};
        int k = 5;
        int[] actual = t.maxNumber(nums1, nums2, k);
        System.out.println(Arrays.toString(actual));
        int[] expected = {9, 8, 3, 1, 9};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums1 = {3, 9, 9, 9};
        int[] nums2 = {3, 9, 8};
        int k = 5;
        int[] actual = t.maxNumber(nums1, nums2, k);
        System.out.println(Arrays.toString(actual));
        int[] expected = {9, 9, 9, 9, 8};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums1 = {8, 9};
        int[] nums2 = {3, 9};
        int k = 3;
        int[] actual = t.maxNumber(nums1, nums2, k);
        System.out.println(Arrays.toString(actual));
        int[] expected = {9, 8, 9};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[] nums1 = {2, 5, 6, 4, 4, 0};
        int[] nums2 = {7, 3, 8, 0, 6, 5, 7, 6, 2};
        int k = 15;
        int[] actual = t.maxNumber(nums1, nums2, k);
        System.out.println(Arrays.toString(actual));
        int[] expected = {7, 3, 8, 2, 5, 6, 4, 4, 0, 6, 5, 7, 6, 2, 0};
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_6() {
        int[] nums1 = {0};
        int[] nums2 = {0, 6, 5, 7, 6, 2};
        int k = 7;
        int[] actual = t.maxNumber(nums1, nums2, k);
        System.out.println(Arrays.toString(actual));
        int[] expected = {0, 6, 5, 7, 6, 2, 0};
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }
}