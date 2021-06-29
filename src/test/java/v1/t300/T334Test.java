package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T334Test {

    T334 t;

    @BeforeEach
    void setUp() {
        t = new T334();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 4, 5};
        boolean actual = t.increasingTriplet(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = {5,4,3,2,1};
        boolean actual = t.increasingTriplet(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = {2,1,5,0,4,6};
        boolean actual = t.increasingTriplet(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}