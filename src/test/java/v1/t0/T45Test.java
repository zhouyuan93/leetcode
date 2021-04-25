package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T45Test {

    T45 t;

    @BeforeEach
    void setUp() {
        t = new T45();
    }

    @Test
    void test_1() {
        int[] nums = {2, 1, 2, 3, 1, 1, 5, 1, 2};
        int actual = t.jump(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }
}