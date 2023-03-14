package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1605Test {

    T1605 t;

    @BeforeEach
    void setUp() {
        t = new T1605();
    }

    @Test
    void test_1() {
        int[] rowSum = {3, 8};
        int[] colSum = {4, 7};
        int[][] actual = t.restoreMatrix(rowSum, colSum);
        for (int[] ints : actual) {
            System.out.println(Arrays.toString(ints));
        }
    }

    @Test
    void test_2() {
        int[] rowSum = {5,7,10};
        int[] colSum = {8,6,8};
        int[][] actual = t.restoreMatrix(rowSum, colSum);
        for (int[] ints : actual) {
            System.out.println(Arrays.toString(ints));
        }
    }
}