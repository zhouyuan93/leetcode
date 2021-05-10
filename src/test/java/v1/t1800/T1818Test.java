package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1818Test {
    T1818 t;

    @BeforeEach
    void setUp() {
        t = new T1818();
    }

    @Test
    void test_1() {
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};
        int actual = t.minAbsoluteSumDiff(nums1, nums2);
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[] nums1 = {2,4,6,8,10};
        int[] nums2 = {2,4,6,8,10};
        int actual = t.minAbsoluteSumDiff(nums1, nums2);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        int[] nums1 = {1,10,4,4,2,7};
        int[] nums2 = {9,3,5,1,7,4};
        int actual = t.minAbsoluteSumDiff(nums1, nums2);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums1 = {1,28,21};
        int[] nums2 = {9,21,20};
        int actual = t.minAbsoluteSumDiff(nums1, nums2);
        int expected = 9;
        assertEquals(expected, actual);
    }
}