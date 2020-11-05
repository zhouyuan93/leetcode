package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1260Test {

    T1260 t;

    @BeforeEach
    void setUp() {
        t = new T1260();
    }

    @Test
    void test_1() {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        List<List<Integer>> actual = t.shiftGrid(grid, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(9, 1, 2));
        expected.add(Arrays.asList(3, 4, 5));
        expected.add(Arrays.asList(6, 7, 8));
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i),actual.get(i));
        }
    }

    @Test
    void test_2() {
        int[][] grid = {{1}};
        int k = 1;
        List<List<Integer>> actual = t.shiftGrid(grid, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i),actual.get(i));
        }
    }
    @Test
    void test_3() {
        int[][] grid = {{}};
        int k = 1;
        List<List<Integer>> actual = t.shiftGrid(grid, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i),actual.get(i));
        }
    }

    @Test
    void test_4() {
        int[][] grid = {{1},{2},{3},{4},{7},{6},{5}};
        int k = 23;
        List<List<Integer>> actual = t.shiftGrid(grid, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(6));
        expected.add(Arrays.asList(5));
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(4));
        expected.add(Arrays.asList(7));
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i),actual.get(i));
        }
    }

}