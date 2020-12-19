package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T389Test {
    
    T389 t;

    @BeforeEach
    void setUp() {
        t = new T389();
    }

    @Test
    void test_1() {
        String s = "abcd";
        String y = "abced";
        char actual = t.findTheDifference(s, y);
        char expected = 'e';
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "";
        String y = "a";
        char actual = t.findTheDifference(s, y);
        char expected = 'a';
        assertEquals(expected, actual);
    }
}