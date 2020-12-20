package weekend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D20201220Test {
    D20201220 t;

    @BeforeEach
    void setUp() {
        t = new D20201220();
    }

    @Test
    void test_t1_1() {
        String number = "123 4-567";
        String actual = t.reformatNumber(number);
        String expected = "123-45-67";
        assertEquals(expected, actual);
    }

    @Test
    void test_t2_1() {
        int[] nums = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        int actual = t.maximumUniqueSubarray(nums);
        int expected = 8;
        assertEquals(expected, actual);

        nums = new int[]{4, 2, 4, 5, 6};
        actual = t.maximumUniqueSubarray(nums);
        expected = 17;
        assertEquals(expected, actual);

        nums = new int[]{558, 508, 782, 32, 187, 103, 370, 607, 619, 267, 984, 10};
        actual = t.maximumUniqueSubarray(nums);
        expected = 5027;
        assertEquals(expected, actual);
    }

    @Test
    void test_t3_t1() {
        int[] nums = {1,-1,-2,4,-7,3};
        int k = 2;
        int actual = t.maxResult(nums,k);
        int expected = 7;
        assertEquals(expected,actual);

        nums = new int[]{1, -5, -20, 4, -1, 3, -6, -3};
        k = 2;
        actual = t.maxResult(nums, k);
        expected = 0;
        assertEquals(expected,actual);

        nums = new int[]{1, -5,6, -20,-2,-1};
        k = 2;
        actual = t.maxResult(nums, k);
        expected = 4;
        assertEquals(expected,actual);

    }
}