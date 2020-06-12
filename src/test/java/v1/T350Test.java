package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T350;

import static org.assertj.core.api.Assertions.assertThat;

class T350Test {
    T350 t;

    @BeforeEach
    void setUp() {
        t = new T350();
    }

    @Test
    void test_1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] actual = t.intersect(nums1, nums2);
        int[] expected = {2, 2};
        assertThat(actual).isEqualTo(expected);
    }
}