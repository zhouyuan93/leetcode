package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T224Test {

    T224 t;

    @BeforeEach
    void setUp() {
        t = new T224();
    }

    @Test
    void test_1() {
        String s = "1";
        int actual = t.calculate(s);
        int expected = 1;
        assertEquals(actual,expected);
    }


    @Test
    void test_2() {
        String s = "-1";
        int actual = t.calculate(s);
        int expected = -1;
        assertEquals(actual,expected);
    }


    @Test
    void test_3() {
        String s = "1-1";
        int actual = t.calculate(s);
        int expected = 0;
        assertEquals(actual,expected);
    }


    @Test
    void test_4() {
        String s = "2 - 1 + 2";
        int actual = t.calculate(s);
        int expected = 3;
        assertEquals(actual,expected);
    }


    @Test
    void test_5() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int actual = t.calculate(s);
        int expected = 23;
        assertEquals(actual,expected);
    }

    @Test
    void test_6() {
        String s = "2147483647";
        int actual = t.calculate(s);
        int expected = 2147483647;
        assertEquals(actual,expected);
    }
}