package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1250Test {

    T1250 t;

    @BeforeEach
    void setUp() {
        t = new T1250();
    }

    @Test
    void test_1() {
        int[] nums = {5, 7, 12, 23};
        boolean actual = t.isGoodArray(nums);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {6, 10, 15};
        boolean actual = t.isGoodArray(nums);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}