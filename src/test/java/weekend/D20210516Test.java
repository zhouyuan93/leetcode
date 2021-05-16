package weekend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class D20210516Test {

    D20210516 t;

    @BeforeEach
    void setUp() {
        t = new D20210516();
    }

    @Test
    void test_1_1() {
        System.out.println(t.subsetXORSum(new int[]{1, 3}));
    }

    @Test
    void test_1_2() {
        System.out.println(t.subsetXORSum(new int[]{5, 1, 6}));
    }

    @Test
    void test_1_3() {
        System.out.println(t.subsetXORSum(new int[]{}));
    }


    @Test
    void test_2_1() {
        String s = "111000";
        int actual = t.minSwaps(s);
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    void test_2_2() {
        String s = "010";
        int actual = t.minSwaps(s);
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void test_2_3() {
        String s = "1110";
        int actual = t.minSwaps(s);
        int expected = -1;
        assertEquals(expected, actual);
    }


    @Test
    void test_2_4() {
        String s = "01011";
        int actual = t.minSwaps(s);
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int[] nums1 = {1, 1, 2, 2, 2, 3};
        int[] nums2 = {1, 4, 5, 2, 5, 4};
        D20210516.FindSumPairs findSumPairs = new D20210516.FindSumPairs(nums1, nums2);
        assertEquals(8, findSumPairs.count(7));  // 返回 8 ; 下标对 (2,2), (3,2), (4,2), (2,4), (3,4), (4,4) 满足 2 + 5 = 7 ，下标对 (5,1), (5,5) 满足 3 + 4 = 7
        findSumPairs.add(3, 2); // 此时 nums2 = [1,4,5,4,5,4]
        assertEquals(2, findSumPairs.count(8));  // 返回 2 ；下标对 (5,2), (5,4) 满足 3 + 5 = 8
        assertEquals(1, findSumPairs.count(4));  // 返回 1 ；下标对 (5,0) 满足 3 + 1 = 4
        findSumPairs.add(0, 1); // 此时 nums2 = [2,4,5,4,5,4]
        findSumPairs.add(1, 1); // 此时 nums2 = [2,5,5,4,5,4]
        assertEquals(11, findSumPairs.count(7));  // 返回 11 ；下标对 (2,1), (2,2), (2,4), (3,1), (3,2), (3,4), (4,1), (4,2), (4,4) 满足 2 + 5 = 7 ，下标对 (5,3), (5,5) 满足 3 + 4 = 7
    }

}