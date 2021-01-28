package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T742Test {
    T742 t;

    @BeforeEach
    void setUp() {
        t = new T742();
    }

    @Test
    void test_1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int actual = t.pivotIndex(nums);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,3};
        int actual = t.pivotIndex(nums);
        int expected = -1;
        assertEquals(expected,actual);
    }
}