package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1030Test {
    T1030 t;

    @BeforeEach
    void setUp() {
        t = new T1030();
    }

    @Test
    void test_1() {
        int R = 1, C = 2, r0 = 0, c0 = 0;
        int[][] actual = t.allCellsDistOrder(R, C, r0, c0);
        validate(actual, r0, c0);
    }

    @Test
    void test_2() {
        int R = 2, C = 2, r0 = 0, c0 = 1;
        int[][] actual = t.allCellsDistOrder(R, C, r0, c0);
        int p = 0;
        for (int i = 0; i < actual.length; i++) {
            int temp = distance(r0, c0, actual[i][0], actual[i][1]);
            assertEquals(true, p <= temp);
        }
    }

    @Test
    void test_3() {
        int R = 2, C = 3, r0 = 1, c0 = 2;
        int[][] actual = t.allCellsDistOrder(R, C, r0, c0);
        validate(actual, r0, c0);
    }

    @Test
    void test_4() {
        int R = 1, C = 1, r0 = 0, c0 = 0;
        int[][] actual = t.allCellsDistOrder(R, C, r0, c0);
        validate(actual, r0, c0);
    }

    private boolean validate(int[][] actual, int r0, int c0) {
        int p = 0;
        for (int i = 0; i < actual.length; i++) {
            int temp = distance(r0, c0, actual[i][0], actual[i][1]);
            assertEquals(true, p <= temp);
        }
        return true;
    }

    private int distance(int x, int y, int m, int n) {
        return Math.abs(x - m) + Math.abs(y - n);
    }
}