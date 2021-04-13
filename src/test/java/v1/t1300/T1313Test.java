package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1313Test {

    T1313 t;

    @BeforeEach
    void setUp() {
        t = new T1313();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 4};
        int[] actual = t.decompressRLElist(nums);
        int[] expected = {2, 4, 4, 4};
        assertArrayEquals(expected,actual);
    }
}