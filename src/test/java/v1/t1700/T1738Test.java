package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1738Test {

    T1738 t;

    @BeforeEach
    void setUp() {
        t = new T1738();
    }

    @Test
    void test_1() {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 1;
        int actual = t.kthLargestValue(matrix, k);
        int expected = 7;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 2;
        int actual = t.kthLargestValue(matrix, k);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 3;
        int actual = t.kthLargestValue(matrix, k);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[][] matrix = {{5, 2}, {1, 6}};
        int k = 4;
        int actual = t.kthLargestValue(matrix, k);
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void test_5() {
        int[][] matrix = {{10,9,5},{2,0,4},{1,0,9},{3,4,8}};
        int k = 10;
        int actual = t.kthLargestValue(matrix, k);
        int expected = 1;
        assertEquals(expected, actual);
    }
}