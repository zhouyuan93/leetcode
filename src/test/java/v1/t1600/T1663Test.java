package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1663Test {

    T1663 t;

    @BeforeEach
    void setUp() {
        t = new T1663();
    }

    @Test
    void test_1() {
        int n = 3;
        int k = 27;
        String actual = t.getSmallestString(n, k);
        String expected = "aay";
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int n = 5;
        int k = 73;
        String actual = t.getSmallestString(n, k);
        String expected = "aaszz";
        assertEquals(expected, actual);
    }
}