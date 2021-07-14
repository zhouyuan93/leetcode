package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1654Test {
    
    T1654 t;

    @BeforeEach
    void setUp() {
        t = new T1654();
    }

    @Test
    void test_1() {
        int[] fb = {14, 4, 18, 1, 15};
        int a = 3;
        int b = 15;
        int x = 9;
        assertEquals(3, t.minimumJumps(fb, a, b, x));
    }


    @Test
    void test_2() {
        int[] fb = {8,3,16,6,12,20};
        int a = 15;
        int b = 13;
        int x = 11;
        assertEquals(-1, t.minimumJumps(fb, a, b, x));
    }


    @Test
    void test_3() {
        int[] fb = {1998};
        int a = 1999;
        int b = 2000;
        int x = 2000;
        assertEquals(3998, t.minimumJumps(fb, a, b, x));
    }
}