package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1319Test {

    T1319 t;

    @BeforeEach
    void setUp() {
        t = new T1319();
    }

    @Test
    void test_1() {
        int n = 6;
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}};
        int actual = t.makeConnected(n, connections);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int n = 11;
        int[][] connections = {{3,4},{5,6},{0,3},{0,5},{1,7},{0,4},{2,6},{1,6},{1,3},{3,7},{4,5},{3,5}};
        int actual = t.makeConnected(n, connections);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int n = 10;
        int[][] connections = {{6,8},{0,4},{1,2},{5,8},{0,9},{1,8},{1,4},{4,9},{4,6},{3,7},{2,4},{3,5},{6,7},{4,5}};
        int actual = t.makeConnected(n, connections);
        int expected = 0;
        assertEquals(expected,actual);
    }

}