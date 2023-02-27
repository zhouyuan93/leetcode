package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1144Test {

    T1144 t;

    @BeforeEach
    void setUp() {
        t = new T1144();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3};
        int actual = t.movesToMakeZigzag(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {9, 6, 1, 6, 2};
        int actual = t.movesToMakeZigzag(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }
}