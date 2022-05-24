package v1.t1700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1716Test {

    T1716 t = new T1716();

    @Test
    void test_1() {
        int actual = t.totalMoney(4);
        assertEquals(10, actual);
    }

    @Test
    void test_2() {
        int actual = t.totalMoney(10);
        assertEquals(37, actual);
    }

    @Test
    void test_3() {
        int actual = t.totalMoney(20);
        assertEquals(96, actual);
    }

    @Test
    void test_4() {
        int actual = t.totalMoney(0);
        assertEquals(0, actual);
    }
}