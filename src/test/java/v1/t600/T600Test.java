package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T600Test {

    T600 t;

    @BeforeEach
    void setUp() {
        t = new T600();
    }

    @Test
    void test_1() {
        int num = 5;
        int actual = t.findIntegers(num);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int num = 1;
        int actual = t.findIntegers(num);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int num = 0;
        int actual = t.findIntegers(num);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int num = 2;
        int actual = t.findIntegers(num);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int num = 6;
        int actual = t.findIntegers(num);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        int num = 7;
        int actual = t.findIntegers(num);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_7() {
        int num = 8;
        int actual = t.findIntegers(num);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_8() {
        int num = 9;
        int actual = t.findIntegers(num);
        int expected = 7;
        assertEquals(expected,actual);
    }

    @Test
    void test_9() {
        int num = 10;
        int actual = t.findIntegers(num);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void test_10() {
        int num = 123;
        int actual = t.findIntegers(num);
        int expected = 34;
        assertEquals(expected,actual);
    }
}