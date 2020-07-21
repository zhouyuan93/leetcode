package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T476;

import static org.junit.jupiter.api.Assertions.*;

class T476Test {

    T476 t ;

    @BeforeEach
    void setUp() {
        t = new T476();
    }

    @Test
    void test_1() {
        int actual = t.findComplement(5);
        int expect = 2;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int actual = t.findComplement(11);
        int expect = 4;
        assertEquals(expect,actual);
    }
}