package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1359Test {

    T1359 t;

    @BeforeEach
    void setUp() {
        t = new T1359();
    }

    @Test
    void test_1() {
        int actual = t.countOrders(1);
        int expect = 1;
        assertEquals(expect,actual);
    }
    @Test
    void test_2() {
        int actual = t.countOrders(2);
        int expect = 6;
        assertEquals(expect,actual);
    }
    @Test
    void test_3() {
        int actual = t.countOrders(3);
        int expect = 90;
        assertEquals(expect,actual);
    }
    @Test
    void test_4() {
        int actual = t.countOrders(4);
        int expect = 2520;
        assertEquals(expect,actual);
    }
    @Test
    void test_5() {
        int actual = t.countOrders(5);
        int expect = 113400;
        assertEquals(expect,actual);
    }
}