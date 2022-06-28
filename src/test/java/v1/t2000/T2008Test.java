package v1.t2000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2008Test {

    T2008 t;

    @BeforeEach
    void setUp() {
        t = new T2008();
    }

    @Test
    void test_1() {
        int n = 5;
        int[][] rides = new int[][]{{2, 5, 4}, {1, 5, 1}};
        long actual = t.maxTaxiEarnings(n, rides);
        long expected = 7;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int n = 20;
        int[][] rides = new int[][]{{1, 6, 1}, {3, 10, 2}, {10, 12, 3}, {11, 12, 2}, {12, 15, 2}, {13, 18, 1}};
        long actual = t.maxTaxiEarnings(n, rides);
        long expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int n = 10;
        int[][] rides = new int[][]{{2,3,6},{8,9,8},{5,9,7},{8,9,1},{2,9,2},{9,10,6},{7,10,10},{6,7,9},{4,9,7},{2,3,1}};
        long actual = t.maxTaxiEarnings(n, rides);
        long expected = 33;
        assertEquals(expected, actual);
    }
}