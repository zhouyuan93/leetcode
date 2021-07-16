package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1765Test {

    T1765 t;

    @BeforeEach
    void setUp() {
        t = new T1765();
    }

    @Test
    void test_1() {
        int[][] isWatter = {{0, 1}, {0, 0}};
        int[][] a = t.highestPeak(isWatter);
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
    }

    @Test
    void test_2() {
        int[][] isWatter = {{0,0,1},{1,0,0},{0,0,0}};
        int[][] a = t.highestPeak(isWatter);
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
    }
}