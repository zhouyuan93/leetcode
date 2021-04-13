package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T421Test {

    T421 t;

    @BeforeEach
    void setUp() {
        t = new T421();
    }

    @Test
    void test_1() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int actual = t.findMaximumXOR(nums);
        int expected = 28;
        assertEquals(expected,actual);
    }
}