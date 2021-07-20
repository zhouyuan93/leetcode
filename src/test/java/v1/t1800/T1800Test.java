package v1.t1800;

import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1800Test {

    T1800 t;

    @BeforeEach
    void setUp() {
        t = new T1800();
    }

    @Test
    void test_1() {
        int[] nums = LeetcodeUtil.initIntArray("[10,20,30,5,10,50]");
        int a = t.maxAscendingSum(nums);
        int e = 65;
        assertEquals(e,a);
    }
}