package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T931Test {

    T931 t;

    @BeforeEach
    void setUp() {
        t = new T931();
    }

    @Test
    void test_1() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int actual = t.minFallingPathSum(a);
        int expect = 12;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[][] a = {{69}};
        int actual = t.minFallingPathSum(a);
        int expect = 69;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int[][] a = {{-80, -13, 22}, {83, 94, -5}, {73, -48, 61}};
        int actual = t.minFallingPathSum(a);
        int expect = -66;
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int[][] a = {{-80, -13, 22}, {83, 94, 5}, {73, -48, 61}};
        int actual = t.minFallingPathSum(a);
        int expect = -56;
        assertEquals(expect, actual);
    }

    @Test
    void test_5() {
        int[][] a = {{-19,57},{-40,-5}};
        int actual = t.minFallingPathSum(a);
        int expect = -59;
        assertEquals(expect, actual);
    }
}