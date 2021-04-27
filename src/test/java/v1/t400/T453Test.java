package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T453Test {

    T453 t;

    @BeforeEach
    void setUp() {
        t = new T453();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3};
        int actual = t.minMoves(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }
}