package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1551Test {
    T1551 t;

    @BeforeEach
    void setUp() {
        t = new T1551();
    }

    @Test
    void test_1() {
        int n = 3;
        int actual = t.minOperations(n);
        int expected = 2;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int n = 6;
        int actual = t.minOperations(n);
        int expected = 9;
        assertEquals(expected,actual);
    }
}