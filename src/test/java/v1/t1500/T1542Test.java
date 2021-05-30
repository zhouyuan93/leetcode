package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1542Test {

    T1542 t;

    @BeforeEach
    void setUp() {
        t = new T1542();
    }

    @Test
    void test_1() {
        String s = "0123445679";
        int actual = t.longestAwesome(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "213123";
        int actual = t.longestAwesome(s);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "0786040670823";
        int actual = t.longestAwesome(s);
        int expected = 11;
        assertEquals(expected, actual);
    }
}