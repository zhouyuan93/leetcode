package v1.t1100;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1129Test {

    T1129 t = new T1129();

    @Test
    void test_1() {
        int n = 3;
        int[][] redEdges = {{0, 1}, {1, 2}};
        int[][] blueEdges = {};
        int[] actual = t.shortestAlternatingPaths(n, redEdges, blueEdges);
        int[] expected = {0, 1, -1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int n = 3;
        int[][] redEdges = {{0, 1}, {0, 2}};
        int[][] blueEdges = {{1, 0}};
        int[] actual = t.shortestAlternatingPaths(n, redEdges, blueEdges);
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_3() {
        int n = 3;
        int[][] redEdges = {{0, 1}};
        int[][] blueEdges = {{1, 2}};
        int[] actual = t.shortestAlternatingPaths(n, redEdges, blueEdges);
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_4() {
        int n = 5;
        int[][] redEdges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        int[][] blueEdges = {{1, 2}, {2, 3}, {3, 1}};
        int[] actual = t.shortestAlternatingPaths(n, redEdges, blueEdges);
        System.out.println(Arrays.toString(actual));
        int[] expected = {0, 1, 2, 3, 7};
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_5() {
        int n = 5;
        int[][] redEdges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        int[][] blueEdges = {{1, 2}, {2, 3}, {3, 1}};
        int[] actual = t.shortestAlternatingPaths(n, redEdges, blueEdges);
        System.out.println(Arrays.toString(actual));
        int[] expected = {0, 1, 2, 3, 7};
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_6() {
        int n = 5;
        int[][] redEdges = {{2,2},{0,4},{4,2},{4,3},{2,4},{0,1},{2,3},{1,3}};
        int[][] blueEdges = {{0,4},{1,0},{1,4},{4,0}};
        int[] actual = t.shortestAlternatingPaths(n, redEdges, blueEdges);
        System.out.println(Arrays.toString(actual));
        int[] expected = {0,1,2,2,1};
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);
    }
}