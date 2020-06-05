package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.MST29;

import static org.junit.jupiter.api.Assertions.*;

class MST29test {
    MST29 t;

    @BeforeEach
    void setUp() {
        t = new MST29();
    }

    @Test
    void test_4() {
        int[][] nums = {
        };
        int[] actual = t.spiralOrder(nums);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_3() {
        int[][] nums = {
                {1},
                {2},
                {3},
                {4}
        };
        int[] actual = t.spiralOrder(nums);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_2() {
        int[][] nums = {
                {1, 2, 3, 4},
        };
        int[] actual = t.spiralOrder(nums);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_1() {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] actual = t.spiralOrder(nums);
        int[] expected = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        assertArrayEquals(expected, actual);
    }
}