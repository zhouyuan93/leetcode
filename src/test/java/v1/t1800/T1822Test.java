package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1822Test {

    T1822 t;

    @BeforeEach
    void setUp() {
        t = new T1822();
    }

    @Test
    void test_1() {
        int[] nums = {1, 5, 2, -3};
        int actual = t.arraySign(nums);
        int expected = -1;
        assertEquals(expected,actual);
    }
}