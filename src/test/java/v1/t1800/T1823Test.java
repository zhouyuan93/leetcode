package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1823Test {

    T1823 t;

    @BeforeEach
    void setUp() {
        t = new T1823();
    }

    @Test
    void test_1() {
        int n = 5;
        int k = 2;
        int actual = t.findTheWinner(n, k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int n = 6;
        int k = 5;
        int actual = t.findTheWinner(n, k);
        int expected = 1;
        assertEquals(expected,actual);
    }
}