package weekend.d20220612;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1Test {

    T1 t = new T1();

    @Test
    void test() {
        int[][] b = {{3, 50}, {7, 10}, {12, 25}};
        int i = 10;
        assertEquals(2.65d, t.calculateTax(b, i));
    }

    @Test
    void test2() {
        int[][] b = {{2, 50}};
        int i = 0;
        assertEquals(2.65d, t.calculateTax(b, i));
    }
}