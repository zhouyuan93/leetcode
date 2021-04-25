package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T639Test {

    T639 t;

    @BeforeEach
    void setUp() {
        t = new T639();
    }

    @Test
    void test_1() {
        String s = "*";
        int actual = t.numDecodings(s);
        int expected = 9;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        String s = "**";
        int actual = t.numDecodings(s);
        int expected = 96;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "1*";
        int actual = t.numDecodings(s);
        int expected = 9 + 9;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String s = "2*";
        int actual = t.numDecodings(s);
        int expected = 6 + 9;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String s = "*";
        int actual = t.numDecodings(s);
        int expected = 9;
        assertEquals(expected, actual);
    }


    @Test
    void test_6() {
        String s = "**";
        int actual = t.numDecodings(s);
        int expected = 96;
        assertEquals(expected, actual);
    }

    @Test
    void test_7() {
        String s = "1*1*0";
        int actual = t.numDecodings(s);
        int expected = 40;
        assertEquals(expected, actual);
    }

    @Test
    void test_8() {
        String s = "1*1";
        int actual = t.numDecodings(s);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void test_9() {
        String s = "7*9*3*6*3*0*5*4*9*7*3*7*1*8*3*2*0*0*6*";
        int actual = t.numDecodings(s);
        int expected = 196465252;
        assertEquals(expected, actual);
    }

    @Test
    void test_10() {
        String s = "1*1*22*19";
        int actual = t.numDecodings(s);
        int expected = 19064;
        assertEquals(expected, actual);
    }
}