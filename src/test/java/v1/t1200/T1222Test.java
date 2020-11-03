package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1222Test {
    T1222 t;

    @BeforeEach
    void setUp() {
        t = new T1222();
    }

    @Test
    void test_1() {
        int[][] queens = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
        int[] king = {0,0};
        List<List<Integer>> actual = t.queensAttacktheKing(queens, king);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 1));
        expected.add(Arrays.asList(1, 0));
        expected.add(Arrays.asList(3, 3));

        actual.sort(Comparator.comparingInt(list -> list.get(0)*10+list.get(1)));
        expected.sort(Comparator.comparingInt(list -> list.get(0)*10+list.get(1)));
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] queens = {{0,0},{1,1},{2,2},{3,4},{3,5},{4,4},{4,5}};
        int[] king = {3,3};
        List<List<Integer>> actual = t.queensAttacktheKing(queens, king);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(3, 4));
        expected.add(Arrays.asList(4, 4));

        actual.sort(Comparator.comparingInt(list -> list.get(0)*10+list.get(1)));
        expected.sort(Comparator.comparingInt(list -> list.get(0)*10+list.get(1)));
        assertEquals(expected, actual);
    }
}