package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1464Test {

    T1464 t;

    @BeforeEach
    void setUp() {
        t = new T1464();
    }

    @Test
    void test_1() {
        int[] nums = {3, 4, 5, 2};
        int actual = t.maxProduct(nums);
        int expected = 12;
        assertEquals(expected,actual);
    }
}