package v1.lcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCP03Test {

    LCP03 t;

    @BeforeEach
    void setUp() {
        t = new LCP03();
    }

    @Test
    void test_1() {
        String command = "URR";
        int[][] obstacles = {};
        int x = 3;
        int y = 2;
        boolean actual = t.robot(command, obstacles, x, y);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        String command = "URR";
        int[][] obstacles = {};
        int x = 3;
        int y = 3;
        boolean actual = t.robot(command, obstacles, x, y);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        String command = "URRURRR";
        int[][] obstacles = {{7, 7}, {0, 5}, {2, 7}, {8, 6}, {8, 7}, {6, 5}, {4, 4}, {0, 3}, {3, 6}};
        int x = 4915;
        int y = 1966;
        boolean actual = t.robot(command, obstacles, x, y);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String command = "UURRUUU";
        int[][] obstacles = { {1, 1}, {5, 0}, {2, 8},{4, 5}, {6, 1}, {7, 10}, {9, 1}};
        int x = 946;
        int y = 2365;
        boolean actual = t.robot(command, obstacles, x, y);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}