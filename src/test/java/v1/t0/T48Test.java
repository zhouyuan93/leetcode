package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T48Test {

    T48 t;

    @BeforeEach
    void setUp() {
        t = new T48();
    }

    @Test
    void test_1() {
        int[][] matrix ={
            { 5, 1, 9,11},
            { 2, 4, 8,10},
            {13, 3, 6, 7},
            {15,14,12,16}
        };
        t.rotate(matrix);
        int[][] expected = {
                {15,13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7,10,11}
        };
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(expected[i], matrix[i]);
        }
    }

    @Test
    void test_2() {
        int[][] matrix ={
                {1}
        };
        t.rotate(matrix);
        int[][] expected = {
                {1}
        };
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(expected[i], matrix[i]);
        }
    }
}