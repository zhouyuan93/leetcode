package v1.jz;

import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ42Test {

    JZ42 t;

    @BeforeEach
    void setUp() {
        t = new JZ42();
    }
    @Test
    void test_1() {
        int[] nums = LeetcodeUtil.initIntArray("[-2,1,-3,4,-1,2,1,-5,4]");
        int a = t.maxSubArray(nums);
        int e = 6;
        assertEquals(e,a);
    }

    @Test
    void test_2() {
        int[] nums = LeetcodeUtil.initIntArray("[-1,0,-2]");
        int a = t.maxSubArray(nums);
        int e = 0;
        assertEquals(e,a);
    }


    @Test
    void test_3() {
        int[] nums = LeetcodeUtil.initIntArray("[-3,1,-2,2]");
        int a = t.maxSubArray(nums);
        int e = 2;
        assertEquals(e,a);
    }
}