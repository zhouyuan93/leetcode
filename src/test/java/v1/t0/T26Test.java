package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T26Test {

    T26 t;

    @BeforeEach
    void setUp() {
        t = new T26();
    }

    @Test
    void test_1() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int actual = t.removeDuplicates(nums);
        int expected = 5;
        assertEquals(expected,actual);
    }
}