package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T65Test {
    T65 t;

    @BeforeEach
    void setUp() {
        t = new T65();
    }

    @Test
    void test_1() {
        String s = "12";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        String s = "+12";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        String s = "+12.1";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }


    @Test
    void test_4() {
        String s = "+12.1E";
        boolean actual = t.isNumber(s);
        boolean expected = false;
        assertEquals(expected,actual);
    }


    @Test
    void test_6() {
        String s = "-0.1";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }


    @Test
    void test_7() {
        String s = "4.";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    void test_8() {
        String s = "-903e";
        boolean actual = t.isNumber(s);
        boolean expected = false;
        assertEquals(expected,actual);
    }
    @Test
    void test_9() {
        String s = "3E+7";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    void test_10() {
        String s = "+12.1E-1";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_11() {
        String s = "E2";
        boolean actual = t.isNumber(s);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_12() {
        String s = "E-2";
        boolean actual = t.isNumber(s);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_13() {
        String s = "-.9";
        boolean actual = t.isNumber(s);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_14() {
        String s = ".e9";
        boolean actual = t.isNumber(s);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_15() {
        String s = "D+";
        boolean actual = t.isNumber(s);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}