package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T154Test {

    T154 t ;

    @BeforeEach
    void setUp() {
        t = new T154();
    }

    @Test
    void test_1() {
        int[] nums = {1, 3, 5};
        int actual = t.findMin(nums);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {2, 2, 2, 0, 1};
        int actual = t.findMin(nums);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {10,1,10,10,10};
        int actual = t.findMin(nums);
        int expected = 1;
        assertEquals(expected,actual);
    }
}