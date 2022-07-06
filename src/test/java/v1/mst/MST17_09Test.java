package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST17_09Test {

    MST17_09 t;

    @BeforeEach
    void setUp() {
        t = new MST17_09();
    }

    @Test
    void test_1() {
        int k = 5;
        int actual = t.getKthMagicNumber(k);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int k = 1;
        int actual = t.getKthMagicNumber(k);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int k = 7;
        int actual = t.getKthMagicNumber(k);
        int expected = 21;
        assertEquals(expected,actual);
    }

}