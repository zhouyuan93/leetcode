package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t300.T324;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T324Test {
    T324 t;

    @BeforeEach
    void setUp() {
        t = new T324();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = nums.length;
        t.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        boolean actual = validateResult(nums, length);
        assertEquals(true, actual);
    }

    @Test
    void test_2() {
        int[] nums = {2, 2, 2, 2, 2, 6, 7, 8, 9, 10};
        int length = nums.length;
        t.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        boolean actual = validateResult(nums, length);
        assertEquals(true, actual);
    }

    @Test
    void test_3() {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3};
        int length = nums.length;
        t.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        boolean actual = validateResult(nums, length);
        assertEquals(true, actual);
    }

    @Test
    void test_4() {
        int[] nums = {1, 5, 1, 1, 6, 4};
        int length = nums.length;
        t.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        boolean actual = validateResult(nums, length);
        assertEquals(true, actual);
    }

    @Test
    void test_5() {
        int[] nums = {3, 3, 3, 2, 2, 2, 3, 2, 1, 1, 2, 1, 2, 3, 3, 3, 1, 2};
        int length = nums.length;
        t.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        boolean actual = validateResult(nums, length);
        assertEquals(true, actual);
    }

    private boolean validateResult(int[] res, int length) {
        if (res == null || length == 0) {
            return true;
        }

        boolean flag = true;
        for (int i = 1; i < res.length; i++) {
            if (flag ? res[i - 1] >= res[i] : res[i - 1] <= res[i]) {
                return false;
            }
            flag = !flag;
        }
        return true;
    }
}