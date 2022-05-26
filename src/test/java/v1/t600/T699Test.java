package v1.t600;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T699Test {

    T699 t = new T699();

    @Test
    void test_1() {
        int[][] positions = {
                {1, 2},
                {2, 3},
                {6, 1}
        };
        List<Integer> actual = t.fallingSquares(positions);
        List<Integer> expected = Arrays.asList(2, 5, 5);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void test_2() {
        int[][] positions = {
                {100, 100},
                {200, 100},
                {300, 100},
                {400, 200},
                {500, 100},
                {600, 100}
        };
        List<Integer> actual = t.fallingSquares(positions);
        List<Integer> expected = Arrays.asList(100, 100, 100, 200, 300, 300);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void test_3() {
        int[][] positions = {
                {9, 6},
                {2, 2},
                {2, 6}
        };
        List<Integer> actual = t.fallingSquares(positions);
        List<Integer> expected = Arrays.asList(6, 6, 8);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void test_4() {
        int[][] positions = {
                {6, 1},
                {9, 2},
                {2, 4}
        };
        List<Integer> actual = t.fallingSquares(positions);
        List<Integer> expected = Arrays.asList(1, 2, 4);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void test_5() {
        int[][] positions = {
                {3, 2},
                {8, 3},
                {1, 4},
                {8, 10},
                {9, 3},
        };
        List<Integer> actual = t.fallingSquares(positions);
        List<Integer> expected = Arrays.asList(2,3,6,13,16);
        assertEquals(expected.toString(), actual.toString());
    }
}