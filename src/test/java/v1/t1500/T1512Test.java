package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1512Test {

    T1512 t;

    @BeforeEach
    void setUp() {
        t = new T1512();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int actual = t.numIdenticalPairs(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }
}