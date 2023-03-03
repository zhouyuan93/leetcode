package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T32Test {

    T32 t;

    @BeforeEach
    void setUp() {
        t = new T32();
    }

    @Test
    void test_1() {
        String s = "(()";
        int actual = t.longestValidParentheses(s);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = ")()())";
        int actual = t.longestValidParentheses(s);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = ")()())(((())))";
        int actual = t.longestValidParentheses(s);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        // 1  1        1     1  1     1  1
        // 0, 1, 2, 1, 0, 1, 0, 1, 2, 1, 2, 3
        String s = "(())()(()((";
        int actual = t.longestValidParentheses(s);
        int expected = 6;
        assertEquals(expected, actual);
    }
}