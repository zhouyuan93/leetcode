package v1.t1300;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1380Test {

    T1380 t = new T1380();

    @Test
    void test_1() {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> actual = t.luckyNumbers(matrix);
        List<Integer> expected = Arrays.asList(15);
        assertEquals(expected,actual);
    }
}