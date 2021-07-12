package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T275Test {

    T275 t;

    @BeforeEach
    void setUp() {
        t = new T275();
    }

    @Test
    void test_1() {
        int[] c = {0, 1, 3, 4, 5};
        int a = t.hIndex(c);
        int e = 3;
        assertEquals(e, a);
    }

    @Test
    void test_2() {
        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 4, 5};
        int a = t.hIndex(c);
        int e = 3;
        assertEquals(e, a);
    }

    @Test
    void test_3() {
        int[] c = {0, 1, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5};
        int a = t.hIndex(c);
        int e = 4;
        assertEquals(e, a);
    }

    @Test
    void test_4() {
        int[] c = {0,0,0};
        int a = t.hIndex(c);
        int e = 0;
        assertEquals(e, a);
    }

    @Test
    void test_5() {
        int[] c = {4,4,4};
        int a = t.hIndex(c);
        int e = 3;
        assertEquals(e, a);
    }

    @Test
    void test_6() {
        int[] c = {1};
        int a = t.hIndex(c);
        int e = 1;
        assertEquals(e, a);
    }

    @Test
    void test_7() {
        int[] c = {0,1};
        int a = t.hIndex(c);
        int e = 1;
        assertEquals(e, a);
    }

    @Test
    void test_8() {
        int[] c = {4,5,6,7,8,9,9,9,9,10};
        int a = t.hIndex(c);
        int e = 7;
        assertEquals(e, a);
    }
}