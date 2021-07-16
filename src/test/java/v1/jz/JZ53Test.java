package v1.jz;

import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JZ53Test {

    JZ53 t;

    @BeforeEach
    void setUp() {
        t = new JZ53();
    }

    @Test
    void test_1() {
        int[] nums = LeetcodeUtil.initIntArray("[5,7,7,8,8,10]");
        int target = 8;
        int a = t.search(nums, target);
        int e = 2;
        assertThat(a).isEqualTo(e);
    }


    @Test
    void test_2() {
        int[] nums = LeetcodeUtil.initIntArray("[5,7,7,8,8,10]");
        int target = 6;
        int a = t.search(nums, target);
        int e = 0;
        assertThat(a).isEqualTo(e);
    }
}