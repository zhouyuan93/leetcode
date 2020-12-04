package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T659Test {
    T659 t;

    @BeforeEach
    void setUp() {
        t = new T659();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 3, 4, 5};
        boolean actual = t.isPossible(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {1, 2, 3, 4, 4, 5};
        boolean actual = t.isPossible(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        boolean actual = t.isPossible(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 6, 6};
        boolean actual = t.isPossible(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[] nums = {1, 2, 5, 5, 6, 6, 7, 8, 8, 9};
        boolean actual = t.isPossible(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int[] nums = {1,2,3};
        boolean actual = t.isPossible(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}