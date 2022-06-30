package v1.t1100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1175Test {
    T1175 t = new T1175();

    @Test
    void test_1() {
        int n = 5;
        int actual = t.numPrimeArrangements(n);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int n = 100;
        int actual = t.numPrimeArrangements(n);
        int expected = 682289015;
        assertEquals(expected, actual);
    }
}