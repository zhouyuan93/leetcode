package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1805Test {

    T1805 t;

    @BeforeEach
    void setUp() {
        t = new T1805();
    }

    @Test
    void test_1() {
        String word = "a123bc34d8ef34";
        int actual = t.numDifferentIntegers(word);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String word = "a1b01c001";
        int actual = t.numDifferentIntegers(word);
        int expected = 1;
        assertEquals(expected,actual);
    }
}