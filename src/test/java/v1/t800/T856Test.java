package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T856Test {

    T856 t;

    @BeforeEach
    void setUp() {
        t = new T856();
    }

    @Test
    void test_1() {
        String s = "()";
        int actual = t.scoreOfParentheses(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String s = "()()";
        int actual = t.scoreOfParentheses(s);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "(())";
        int actual = t.scoreOfParentheses(s);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "(()(()))";
        int actual = t.scoreOfParentheses(s);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String s = "()(())";
        int actual = t.scoreOfParentheses(s);
        int expected = 3;
        assertEquals(expected, actual);
    }
}