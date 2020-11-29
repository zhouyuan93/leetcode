package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T976Test {

    T976 t ;

    @BeforeEach
    void setUp() {
        t = new T976();
    }

    @Test
    void test_1() {
        int[] nums = new int[]{2, 1, 2};
        int actual = t.largestPerimeter(nums);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] nums = new int[]{ 1, 2};
        int actual = t.largestPerimeter(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] nums = new int[]{ 1,1, 2};
        int actual = t.largestPerimeter(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }
}