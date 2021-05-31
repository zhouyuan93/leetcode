package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1301Test {

    T1301 t;

    @BeforeEach
    void setUp() {
        t = new T1301();
    }

    @Test
    void test_1() {
        List<String> board = Arrays.asList("E23", "2X2", "12S");
        int[] actual = t.pathsWithMaxScore(board);
        int[] expected = {7, 1};
        assertArrayEquals(expected, actual);
    }


    @Test
    void test_2() {
        List<String> board = Arrays.asList("E12", "1X1", "21S");
        int[] actual = t.pathsWithMaxScore(board);
        int[] expected = {4, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_3() {
        List<String> board = Arrays.asList("E11", "XXX", "11S");
        int[] actual = t.pathsWithMaxScore(board);
        int[] expected = {0, 0};
        assertArrayEquals(expected, actual);
    }
}