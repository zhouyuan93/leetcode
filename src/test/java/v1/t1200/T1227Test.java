package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1227Test {

    T1227 t;

    @BeforeEach
    void setUp() {
        t = new T1227();
    }

    @Test
    void test_1() {
        int n = 1;
        double a = t.nthPersonGetsNthSeat(n);
        double b = 1D;
        assertEquals(a,b);
    }

    @Test
    void test_2() {
        int n = 2;
        double a = t.nthPersonGetsNthSeat(n);
        double b = 0.5D;
        assertEquals(a,b);
    }

    @Test
    void test_3() {
        int n = 3;
        double a = t.nthPersonGetsNthSeat(n);
        double b = 0.5D;
        assertEquals(a,b);
    }

    @Test
    void test_4() {
        int n = 11;
        double a = t.nthPersonGetsNthSeat(n);
        double b = 0.5D;
        assertTrue(Math.abs(a-b) < 0.00000001);
    }
}