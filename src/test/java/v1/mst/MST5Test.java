package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST5Test {

    MST5 t;

    @BeforeEach
    void setUp() {
        t = new MST5();
    }

    @Test
    void test_1() {
        int N = 1024;
        int M = 19;
        int i = 2;
        int j = 6;
        int actual = t.insertBits(N, M, i, j);
        int expect = 1100;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int N = 1143207437;
        int M = 1017033;
        int i = 11;
        int j = 31;
        int actual = t.insertBits(N, M, i, j);
        int expect = 2082885133;
        System.out.println(2082885133 - 1143207437);
        assertEquals(expect, actual);
    }
}