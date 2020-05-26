package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T125Test {

    T125 t;

    @BeforeEach
    void setUp() {
        t = new T125();
    }
    @Test
    void test_5() {
        String s = "   ";
        boolean actual = t.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_4() {
        String s = "A man, a plan, a canal: Panama";
        boolean actual = t.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        String s = " a   b a";
        boolean actual = t.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        String s = " a    a";
        boolean actual = t.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_1() {
        String s = " asdf dfd dsf";
        boolean actual = t.isPalindrome(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}