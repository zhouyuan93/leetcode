package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T873Test {

    T873 t ;

    @BeforeEach
    void setUp() {
        t = new T873();
    }

    @Test
    void test_1() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int actual = t.lenLongestFibSubseq(a);
        int expect = 5;
        assertEquals(expect,actual);
    }
}