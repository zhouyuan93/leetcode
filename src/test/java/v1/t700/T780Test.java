package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T780Test {

    T780 t;

    @BeforeEach
    void setUp() {
        t = new T780();
    }

    @Test
    void test_1() {
        int sx = 1;
        int sy = 1;
        int tx = 3;
        int ty = 5;
        boolean actual = t.reachingPoints(sx, sy, tx, ty);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int sx = 1;
        int sy = 1;
        int tx = 2;
        int ty = 2;
        boolean actual = t.reachingPoints(sx, sy, tx, ty);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int sx = 1;
        int sy = 1;
        int tx = 1000000000;
        int ty = 1;
        boolean actual = t.reachingPoints(sx, sy, tx, ty);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int sx = 10;
        int sy = 4;
        int tx = 10;
        int ty = 20;
        boolean actual = t.reachingPoints(sx, sy, tx, ty);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int sx = 9;
        int sy = 10;
        int tx = 9;
        int ty = 19;
        boolean actual = t.reachingPoints(sx, sy, tx, ty);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int sx = 9;
        int sy = 5;
        int tx = 12;
        int ty = 8;
        boolean actual = t.reachingPoints(sx, sy, tx, ty);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}