package v1.t900;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T905Test {

    T905 t = new T905();

    @Test
    void test_1() {
        int[] nums = {3, 1, 2, 4};
        int[] actual = t.sortArrayByParity(nums);
        System.out.println(Arrays.toString(actual));
        assertTrue(validate(actual));
    }

    @Test
    void test_2() {
        int[] nums = {};
        int[] actual = t.sortArrayByParity(nums);
        System.out.println(Arrays.toString(actual));
        assertTrue(validate(actual));
    }

    @Test
    void test_3() {
        int[] nums = {1,3,5,7,9};
        int[] actual = t.sortArrayByParity(nums);
        System.out.println(Arrays.toString(actual));
        assertTrue(validate(actual));
    }

    private boolean validate(int[] nums) {
        boolean t = true;
        for (int x : nums) {
            if ((x & 1) == 0) {
                if (!t) {
                    return false;
                }
            }else{
                t = false;
            }
        }
        return true;
    }
}