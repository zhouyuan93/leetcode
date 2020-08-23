package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T946Test {

    T946 t;

    @BeforeEach
    void setUp() {
        t = new T946();
    }

    @Test
    void test_1() {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        boolean actual = t.validateStackSequences(pushed, popped);
        boolean expect = true;
        assertEquals(expect, actual);
    }
    @Test
    void test_2() {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        boolean actual = t.validateStackSequences(pushed, popped);
        boolean expect = false;
        assertEquals(expect, actual);
    }
    @Test
    void test_3() {
        int[] pushed = {1,0};
        int[] popped = {1,0};
        boolean actual = t.validateStackSequences(pushed, popped);
        boolean expect = true;
        assertEquals(expect, actual);
    }
}