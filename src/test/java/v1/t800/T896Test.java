package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T896Test {
    T896 t ;

    @BeforeEach
    void setUp() {
        t = new T896();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 2, 3};
        boolean actual = t.isMonotonic(nums);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {6,5,4,4};
        boolean actual = t.isMonotonic(nums);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {5};
        boolean actual = t.isMonotonic(nums);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = {1,2,4,3,4,5};
        boolean actual = t.isMonotonic(nums);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] nums = {};
        boolean actual = t.isMonotonic(nums);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}