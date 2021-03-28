package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T917Test {

    T917 t;

    @BeforeEach
    void setUp() {
        t = new T917();
    }

    @Test
    void test_1() {
        String s = "ab-cd";
        String actual = t.reverseOnlyLetters(s);
        String expected = "dc-ba";
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        String s = "7_28]";
        String actual = t.reverseOnlyLetters(s);
        String expected = "7_28]";
        assertEquals(expected,actual);
    }
}