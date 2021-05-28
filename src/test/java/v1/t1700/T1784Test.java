package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1784Test {

    T1784 t;

    @BeforeEach
    void setUp() {
        t = new T1784();
    }

    @Test
    void test_1() {
        String s = "0011";
        boolean actual = t.checkOnesSegment(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "110011";
        boolean actual = t.checkOnesSegment(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "101011";
        boolean actual = t.checkOnesSegment(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String s = "10000110011";
        boolean actual = t.checkOnesSegment(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String s = "1001";
        boolean actual = t.checkOnesSegment(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}