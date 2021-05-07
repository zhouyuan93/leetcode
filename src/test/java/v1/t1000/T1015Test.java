package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1015Test {

    T1015 t;

    @BeforeEach
    void setUp() {
        t = new T1015();
    }

    @Test
    void test_1() {
        int k = 1;
        int actual = t.smallestRepunitDivByK(k);
        int expected = 1;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int k = 2;
        int actual = t.smallestRepunitDivByK(k);
        int expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int k = 3;
        int actual = t.smallestRepunitDivByK(k);
        int expected = 3;
        assertEquals(expected,actual);
    }


    @Test
    void test_4() {
        int k = 5;
        int actual = t.smallestRepunitDivByK(k);
        int expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int k = 23;
        int actual = t.smallestRepunitDivByK(k);
        int expected = 22;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        int k = 25;
        int actual = t.smallestRepunitDivByK(k);
        int expected = -1;
        assertEquals(expected,actual);
    }
}