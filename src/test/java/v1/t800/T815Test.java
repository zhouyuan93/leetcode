package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T815Test {

    T815 t;

    @BeforeEach
    void setUp() {
        t = new T815();
    }

    @Test
    void test_1() {
        int[][] routes = {{1, 2, 7}, {3, 6, 7}};
        int source = 1;
        int target = 6;
        int actual = t.numBusesToDestination(routes, source, target);
        int expected = 2;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int[][] routes = {{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15;
        int target = 12;
        int actual = t.numBusesToDestination(routes, source, target);
        int expected = -1;
        assertEquals(expected,actual);
    }
}