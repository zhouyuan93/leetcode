package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST17_01Test {

    MST17_01 t;

    @BeforeEach
    void setUp() {
        t = new MST17_01();
    }

    @Test
    void test_1() {
        int a = t.add(3, 4);
        int e = 7;
        assertEquals(e,a);
    }

    @Test
    void test_2() {
        int a = t.add(-3, 4);
        int e = 1;
        assertEquals(e,a);
    }

    @Test
    void test_3() {
        int a = t.add(-3, -4);
        int e = -7;
        assertEquals(e,a);
    }
}