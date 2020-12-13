package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T464Test {

    T464 t;

    @BeforeEach
    void setUp() {
        t = new T464();
    }

    @Test
    void test_1() {
        int max = 10;
        int desiredTotal = 11;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int max = 10;
        int desiredTotal = 12;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int max = 10;
        int desiredTotal = 40;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int max = 4;
        int desiredTotal = 8;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int max = 7;
        int desiredTotal = 16;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int max = 5;
        int desiredTotal = 50;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_7() {
        int max = 4;
        int desiredTotal = 10;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_8() {
        int max = 5;
        int desiredTotal = 15;
        boolean actual = t.canIWin(max, desiredTotal);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}