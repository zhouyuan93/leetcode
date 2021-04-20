package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T942Test {

    T942 t;

    @BeforeEach
    void setUp() {
        t = new T942();
    }

    @Test
    void test_1() {
        String s = "IDID";
        int[] nums = t.diStringMatch(s);
        System.out.println(Arrays.toString(nums));
        assertTrue(validate(nums, s));
    }

    @Test
    void test_2() {
        String s = "DDI";
        int[] nums = t.diStringMatch(s);
        System.out.println(Arrays.toString(nums));
        assertTrue(validate(nums, s));
    }

    public boolean validate(int[] nums, String s) {
        int before = nums[0];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = nums[i + 1];
            if (c == 'I') {
                if (num <= before) {
                    return false;
                }
            }else{
                if (num >= before) {
                    return false;
                }
            }
            before = num;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return false;
            }
        }
        return true;
    }
}