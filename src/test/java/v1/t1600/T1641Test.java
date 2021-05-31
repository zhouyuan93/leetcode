package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1641Test {

    T1641 t;

    @BeforeEach
    void setUp() {
        t = new T1641();
    }

    @Test
    void test_1() {
        int n = 1;
        int actual = t.countVowelStrings(n);
        int expected = 5;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int n = 2;
        int actual = t.countVowelStrings(n);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int n = 33;
        int actual = t.countVowelStrings(n);
        int expected = 66045;
        assertEquals(expected, actual);
    }
}