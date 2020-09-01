package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T486Test {

    T486 t;

    @BeforeEach
    void setUp() {
        t = new T486();
    }

    @Test
    void test_1() {
        int[] nums = {1, 5, 2};
        boolean actual = t.PredictTheWinner(nums);
        boolean expect = false;
        assertEquals(expect,actual);
    }

    @Test
    void test_2() {
        int[] nums = {1, 5, 233, 7};
        boolean actual = t.PredictTheWinner(nums);
        boolean expect = true;
        assertEquals(expect,actual);
    }

    @Test
    void test_3() {
        int[] nums = {1, 5};
        boolean actual = t.PredictTheWinner(nums);
        boolean expect = true;
        assertEquals(expect,actual);
    }

    @Test
    void test_4() {
        int[] nums = {1000,999,999,1000,555,400};
        boolean actual = t.PredictTheWinner(nums);
        boolean expect = true;
        assertEquals(expect,actual);
    }
}