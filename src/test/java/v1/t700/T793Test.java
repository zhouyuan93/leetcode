package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T793Test {

    T793 t;

    @BeforeEach
    void setUp() {
        t = new T793();
    }

    @Test
    void test_1() {
        int actual = t.preimageSizeFZF(1);
        int expected = 5;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int actual = t.preimageSizeFZF(5);
        int expected = 0;
        assertEquals(expected, actual);
    }



    @Test
    void test_3() {
        int actual = t.preimageSizeFZF(12);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int actual = t.preimageSizeFZF(1000000000);
        int expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    void test_5() {
        int actual = t.preimageSizeFZF(7);
        int expected = 5;
        assertEquals(expected, actual);
    }
}