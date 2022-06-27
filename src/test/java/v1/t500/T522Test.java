package v1.t500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T522Test {

    T522 t = new T522();

    @Test
    void test_1() {
        String[] strs = {"aba", "cdc", "eae"};
        int actual = t.findLUSlength(strs);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String[] strs = {"aaa", "aaa", "a"};
        int actual = t.findLUSlength(strs);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String[] strs = {"aabbcc", "aabbcc","cb"};
        int actual = t.findLUSlength(strs);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String[] strs = {"a","b","c","d","e","f","a","b","c","d","e","f"};
        int actual = t.findLUSlength(strs);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String[] strs = {"aabbcc", "aabbcc","c"};
        int actual = t.findLUSlength(strs);
        int expected = -1;
        assertEquals(expected, actual);
    }
}