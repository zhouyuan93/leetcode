package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T912Test {

    T912 t;

    @BeforeEach
    void setUp() {
        t = new T912();
    }

    @Test
    void test_1() {
        int[] nums = {5, 4, 3, 3, 1};
        int[] actual = t.sortArray(nums);
        int[] expected = {1, 3, 3, 4, 5};
        assertArrayEquals(expected,actual);
    }


    @Test
    void test_2() {
        int[] nums = {-4,0,7,4,9,-5,-1,0,-7,-1};
        int[] actual = t.sortArray(nums);
        int[] expected = {-7,-5,-4,-1,-1,0,0,4,7,9};
        assertArrayEquals(expected,actual);
    }
}