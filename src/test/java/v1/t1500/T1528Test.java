package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1528Test {

    T1528 t;

    @BeforeEach
    void setUp() {
        t = new T1528();
    }

    @Test
    void test_1() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String actual = t.restoreString(s, indices);
        String expected = "leetcode";
        assertEquals(expected,actual);
    }
}