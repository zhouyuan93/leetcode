package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T767Test {

    T767 t;

    @BeforeEach
    void setUp() {
        t = new T767();
    }

    @Test
    void test_1() {
        String s = "aab";
        String actual = t.reorganizeString(s);
        assertEquals(true,check(actual));
    }

    @Test
    void test_2() {
        String s = "aaab";
        String actual = t.reorganizeString(s);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "aaabbb";
        String actual = t.reorganizeString(s);
        assertEquals(true,check(actual));
    }


    private boolean check(String actual) {
        char[] chars =  actual.toCharArray();
        char before = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (before == chars[i]) {
                return false;
            }
            before = chars[i];
        }
        return true;
    }
}