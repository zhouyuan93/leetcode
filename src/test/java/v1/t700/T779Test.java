package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T779Test {
    T779 t;

    @BeforeEach
    void setUp() {
        t = new T779();
    }

    @Test
    void test_1() {
        int n = 1;
        int k = 1;
        int actual = t.kthGrammar(n, k);
        int expected = 0;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int n = 2;
        int k = 1;
        int actual = t.kthGrammar(n, k);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int n = 2;
        int k = 2;
        int actual = t.kthGrammar(n, k);
        int expected = 1;
        assertEquals(expected,actual);
    }


    @Test
    void test_4() {
        int n = 4;
        int k = 5;
        int actual = t.kthGrammar(n, k);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int n = 3;
        int k = 3;
        int actual = t.kthGrammar(n, k);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        int n = 30;
        int k = 264193044;
        int actual = t.kthGrammar(n, k);
        int expected = 0;
        assertEquals(expected,actual);
    }
}