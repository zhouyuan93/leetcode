package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T88;

import static org.junit.jupiter.api.Assertions.*;

class T88Test {
    private T88 t;

    @BeforeEach
    void setUp() {
        t = new T88();
    }

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        t.merge(nums1, m, nums2, n);

        int[] expect = {1, 2, 2, 3, 5, 6};

        assertArrayEquals(expect, nums1);
    }
}