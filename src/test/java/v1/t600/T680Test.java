package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t600.T680;

import static org.junit.jupiter.api.Assertions.*;

class T680Test {
    T680 t;

    @BeforeEach
    void setUp() {
        t = new T680();
    }

    @Test
    void test_6() {
        String s = "";
        boolean actual = t.validPalindrome(s);
        boolean excepted = true;
        assertEquals(excepted,actual);
    }
    @Test
    void test_5() {
        String s = "i";
        boolean actual = t.validPalindrome(s);
        boolean excepted = true;
        assertEquals(excepted,actual);
    }
    @Test
    void test_4() {
        String s = "ai";
        boolean actual = t.validPalindrome(s);
        boolean excepted = true;
        assertEquals(excepted,actual);
    }
    @Test
    void test_3() {
        String s = "aie";
        boolean actual = t.validPalindrome(s);
        boolean excepted = false;
        assertEquals(excepted,actual);
    }
    @Test
    void test_2() {
        String s = "abccea";
        boolean actual = t.validPalindrome(s);
        boolean excepted = false;
        assertEquals(excepted,actual);
    }
    @Test
    void test_1() {
        String s = "abca";
        boolean actual = t.validPalindrome(s);
        boolean excepted = true;
        assertEquals(excepted,actual);
    }
}