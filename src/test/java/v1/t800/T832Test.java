package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T832Test {

    T832 t;

    @BeforeEach
    void setUp() {
        t = new T832();
    }

    @Test
    void test_1() {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] actual = t.flipAndInvertImage(A);
        int[][] expected = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }


    @Test
    void test_2() {
        int[][] A = {{1}};
        int[][] actual = t.flipAndInvertImage(A);
        int[][] expected = {{0}};
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test_3() {
        int[][] A = {{1,0,0,1}};
        int[][] actual = t.flipAndInvertImage(A);
        int[][] expected = {{0,1,1,0}};
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

}