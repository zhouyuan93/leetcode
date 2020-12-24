package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T387Test {

    T387 t;

    @BeforeEach
    void setUp() {
        t = new T387();
    }

    @Test
    void test_1() {
        String s = "leetcode";
        int actual = t.firstUniqChar(s);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String s = "loveleetcode";
        int actual = t.firstUniqChar(s);
        int expected = 2;
        assertEquals(expected,actual);
    }
}