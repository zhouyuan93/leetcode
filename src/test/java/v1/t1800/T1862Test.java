package v1.t1800;

import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1862Test {
    
    T1862 t;

    @BeforeEach
    void setUp() {
        t = new T1862();
    }

    @Test
    void test_1() {
        int[] nums = LeetcodeUtil.initIntArray("[2,5,9]");
        int a = t.sumOfFlooredPairs(nums);
        int e = 10;
        assertEquals(e, a);
    }


    @Test
    void test_2() {
        int[] nums = LeetcodeUtil.initIntArray("[7,7,7,7,7,7,7]");
        int a = t.sumOfFlooredPairs(nums);
        int e = 49;
        assertEquals(e, a);
    }
}