package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T674Test {

    T674 t;

    @BeforeEach
    void setUp() {
        t = new T674();
    }

    @Test
    void test_1() {
        int[] nums = {1, 3, 5, 4, 7};
        int actual = t.findLengthOfLCIS(nums);
        int expected = 3;
        assertEquals(expected,actual);
    }
}