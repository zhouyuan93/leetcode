package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T71Test {

    T71 t;

    @BeforeEach
    void setUp() {
        t = new T71();
    }

    @Test
    void test_1() {
        String path = "/home/";
        String actual = t.simplifyPath(path);
        String expected = "/home";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String path = "/../";
        String actual = t.simplifyPath(path);
        String expected = "/";
        assertEquals(expected,actual);
    }
    @Test
    void test_3() {
        String path = "/home//foo/";
        String actual = t.simplifyPath(path);
        String expected = "/home/foo";
        assertEquals(expected,actual);
    }
    @Test
    void test_4() {
        String path = "/a/./b/../../c/";
        String actual = t.simplifyPath(path);
        String expected = "/c";
        assertEquals(expected,actual);
    }
}