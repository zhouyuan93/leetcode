package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T941Test {

    T941 t;

    @BeforeEach
    void setUp() {
        t = new T941();
    }

    @Test
    void test_1() {
        int[] a = {2, 1};
        boolean actual = t.validMountainArray(a);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        int[] a = {3,5,5};
        boolean actual = t.validMountainArray(a);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        int[] a = {0,3,2,1};
        boolean actual = t.validMountainArray(a);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_4() {
        int[] a = {0,3,2,1,1,0};
        boolean actual = t.validMountainArray(a);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}