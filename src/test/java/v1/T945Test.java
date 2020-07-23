package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T945Test {

    T945 t;

    @BeforeEach
    void setUp() {
        t = new T945();
    }

    @Test
    void test_2() {
        int[] A = {1,2,2};
        int actual = t.minIncrementForUnique(A);
        int expect = 1;
        assertEquals(expect, actual);
    }
    @Test
    void test_1() {
        int[] A = {3,2,1,2,1,7};
        int actual = t.minIncrementForUnique(A);
        int expect = 6;
        assertEquals(expect, actual);
    }
}