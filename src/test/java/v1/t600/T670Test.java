package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T670Test {

    T670 t;

    @BeforeEach
    void setUp() {
        t = new T670();
    }

    @Test
    void test_1() {
        int num = 2736;
        int actual = t.maximumSwap(num);
        int expected = 7236;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int num = 7632;
        int actual = t.maximumSwap(num);
        int expected = 7632;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int num = 9999;
        int actual = t.maximumSwap(num);
        int expected = 9999;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int num = 19999;
        int actual = t.maximumSwap(num);
        int expected = 99991;
        assertEquals(expected,actual);
    }
}