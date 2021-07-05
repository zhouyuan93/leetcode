package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ65Test {

    JZ65 t;

    @BeforeEach
    void setUp() {
        t = new JZ65();
    }

    @Test
    void test_1() {
        int a = t.add(1, 9);
        int e = 10;
        assertEquals(e,a);
    }


    @Test
    void test_2() {
        int a = t.add(112, 229);
        int e = 341;
        assertEquals(e,a);
    }


    @Test
    void test_3() {
        int a = t.add(-1,-1);
        int e = -2;
        assertEquals(e,a);
    }
}