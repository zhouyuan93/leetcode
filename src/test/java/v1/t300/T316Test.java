package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T316Test {

    T316 t;

    @BeforeEach
    void setUp() {
        t = new T316();
    }

    @Test
    void test_1() {
        String s = "bcabc";
        String actual = t.removeDuplicateLetters(s);
        String expected = "abc";
        assertEquals(expected,actual);
    }
}