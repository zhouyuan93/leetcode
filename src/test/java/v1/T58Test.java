package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T58;

import static org.junit.jupiter.api.Assertions.*;

class T58Test {
    private T58 t;

    @BeforeEach
    void setUp() {
        t = new T58();
    }

    @Test
    void test4() {
        String s = " hellow world  ";
        int actual = t.lengthOfLastWord(s);
        int except = 5;
        assertEquals(except, actual);
    }

    @Test
    void test3() {
        String s = " aaa  ";
        int actual = t.lengthOfLastWord(s);
        int except = 3;
        assertEquals(except, actual);
    }

    @Test
    void test2() {
        String s = "  ";
        int actual = t.lengthOfLastWord(s);
        int except = 0;
        assertEquals(except, actual);
    }

    @Test
    void test1() {
        String s = "";
        int actual = t.lengthOfLastWord(s);
        int except = 0;
        assertEquals(except, actual);
    }
}