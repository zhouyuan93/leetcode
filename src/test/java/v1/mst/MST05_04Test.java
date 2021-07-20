package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST05_04Test {

    MST05_04 t;

    @BeforeEach
    void setUp() {
        t = new MST05_04();
    }

    @Test
    void test_1() {
        int[] a = t.findClosedNumbers(2);
        int[] e = {4, 1};
        assertArrayEquals(e,a);
    }

    @Test
    void test_2() {
        int[] a = t.findClosedNumbers(1);
        int[] e = {2, -1};
        assertArrayEquals(e,a);
    }

    @Test
    void test_3() {
        int[] a = t.findClosedNumbers(22);
        int[] e = {25, 21};
        assertArrayEquals(e,a);
    }


    @Test
    void test_4() {
        int[] a = t.findClosedNumbers(65);
        int[] e = {66,48};
        assertArrayEquals(e, a);
    }

    @Test
    void test_5() {
        int[] a = t.findClosedNumbers(67);
        int[] e = {69,56};
        assertArrayEquals(e, a);
    }
}