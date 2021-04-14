package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1753Test {

    T1753 t;

    @BeforeEach
    void setUp() {
        t = new T1753();
    }

    @Test
    void test_1() {
        int actual = t.maximumScore(4, 4, 6);
        int expected = 7;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int actual = t.maximumScore(1, 8, 8);
        int expected = 8;
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        int actual = t.maximumScoreSort(2, 4, 6);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int actual = t.maximumScore(29, 30, 18);
        int expected = 38;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int actual = t.maximumScore(4, 4, 7);
        int expected = 7;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        int actual = t.maximumScore(4, 4, 6);
        int expected = 7;
        assertEquals(expected,actual);
    }
}