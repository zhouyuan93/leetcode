package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t200.T205;

import static org.junit.jupiter.api.Assertions.*;

class T205Test {
    T205 t;

    @BeforeEach
    void setUp() {
        t = new T205();
    }

    @Test
    void test_3() {
        String x = "paper";
        String y = "title";
        boolean actual = t.isIsomorphic(x, y);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        String x = "ebg";
        String y = "ibb";
        boolean actual = t.isIsomorphic(x, y);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void test_1() {
        String x = "egg--123";
        String y = "ibb++456";
        boolean actual = t.isIsomorphic(x, y);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}