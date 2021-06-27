package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T909Test {

    T909 t;

    @BeforeEach
    void setUp() {
        t = new T909();
    }

    @Test
    void test_1() {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}};
        int actual = t.snakesAndLadders(board);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] board = {{1, 1, -1},
                {1, 1, 1},
                {-1, 1, 1}};
        int actual = t.snakesAndLadders(board);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[][] board = {
                {-1, 1, 2, -1},   // 16 15 14 13
                {2, 13, 15, -1},   // 9 10 11 12
                {-1, 10, -1, -1},  // 8 7  6  5
                {-1, 6, 2, 8}};    // 1 2  3  4
        int actual = t.snakesAndLadders(board);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[][] board = {
                {-1, -1, -1, -1, 48, 5, -1},    // 43 44 45 46 47 48 49
                {12, 29, 13, 9, -1, 2, 32},     // 42 41 40 39 38 37 36
                {-1, -1, 21, 7, -1, 12, 49},    // 29 30 31 32 33 34 35
                {42, 37, 21, 40, -1, 22, 12},   // 28 27 26 25 24 23 22
                {42, -1, 2, -1, -1, -1, 6},     // 15 16 17 18 19 20 21
                {39, -1, 35, -1, -1, 39, -1},   // 14 13 12 11 10 9  8
                {-1, 36, -1, -1, -1, -1, 5}     // 1  2  3  4  5  6  7
        };
        int actual = t.snakesAndLadders(board);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[][] board = {
                {-1, -1, 27, 13, -1, 25, -1},     // 43 44 45 46 47 48 49
                {-1, -1, -1, -1, -1, -1, -1},     // 42 41 40 39 38 37 36
                {44, -1, 8, -1, -1, 2, -1},       // 29 30 31 32 33 34 35
                {-1, 30, -1, -1, -1, -1, -1},     // 28 27 26 25 24 23 22
                {3, -1, 20, -1, 46, 6, -1},       // 15 16 17 18 19 20 21
                {-1, -1, -1, -1, -1, -1, 29},     // 14 13 12 11 10 9  8
                {-1, 29, 21, 33, -1, -1, -1}};    // 1  2  3  4  5  6  7
        int actual = t.snakesAndLadders(board);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test() {
        t.len = 6;
        System.out.println(t.getTrans(0,0));
    }
}