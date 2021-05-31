package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T775Test {

    T775 t;

    @BeforeEach
    void setUp() {
        t = new T775();
    }

    @Test
    void test_1() {
        int[] nums = {1,0,2};
        boolean actual = t.isIdealPermutation(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}