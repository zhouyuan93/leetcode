package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T164Test {

    T164 t;

    @BeforeEach
    void setUp() {
        t = new T164();
    }

    @Test
    void test_1() {
        int[] nums = {3, 6, 9, 1};
        int actual = t.maximumGap(nums);
        int expect = 3;
        assertEquals(expect, actual);
    }
}