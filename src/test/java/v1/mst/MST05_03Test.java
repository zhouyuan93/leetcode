package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST05_03Test {

    MST05_03 t;

    @BeforeEach
    void setUp() {
        t = new MST05_03();
    }

    @Test
    void test_1() {
        int num = 1775;
        int actual = t.reverseBits(num);
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int num =1 ;
        int actual = t.reverseBits(num);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int num =2147483647 ;
        int actual = t.reverseBits(num);
        int expected = 32;
        assertEquals(expected,actual);
    }
}