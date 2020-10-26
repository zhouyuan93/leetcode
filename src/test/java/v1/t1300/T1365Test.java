package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1365Test {

    T1365 t;

    @BeforeEach
    void setUp() {
        t = new T1365();
    }

    @Test
    void test_1() {
        int[] nums = {8, 1, 2, 2, 3};
        int[] expected = {4, 0, 1, 1, 3};
        int[] actual = t.smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected,actual);
    }
}