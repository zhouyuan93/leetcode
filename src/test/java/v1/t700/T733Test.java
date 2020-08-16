package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T733Test {

    T733 t;

    @BeforeEach
    void setUp() {
        t = new T733();
    }

    @Test
    void test_1() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        int[][] actual = t.floodFill(image, sr, sc, newColor);
        int[][] expect = {{2,2,2},{2,2,0},{2,0,1}};

        assertArrayEquals(expect, actual);

    }

    @Test
    void test_2() {
        int[][] image = {{0,0,0},{0,1,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;

        int[][] actual = t.floodFill(image, sr, sc, newColor);
        int[][] expect = {{0,0,0},{0,1,1}};

        assertArrayEquals(expect, actual);

    }
}