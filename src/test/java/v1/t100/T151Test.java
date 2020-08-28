package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T151Test {

    T151 t;

    @BeforeEach
    void setUp() {
        t = new T151();
    }

    @Test
    void test_1() {
        String s = "the sky is blue";
        String actual = t.reverseWords(s);
        String expect = "blue is sky the";
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        String s = "  hello world!  ";
        String actual = t.reverseWords(s);
        String expect = "world! hello";
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        String s = "a good   example";
        String actual = t.reverseWords(s);
        String expect = "example good a";
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        String s = " ";
        String actual = t.reverseWords(s);
        String expect = "";
        assertEquals(expect, actual);
    }
}