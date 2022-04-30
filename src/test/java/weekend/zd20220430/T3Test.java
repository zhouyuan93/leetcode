package weekend.zd20220430;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3Test {

    T3 t = new T3();

    @Test
    void test1() {
        int m = 4;
        int n = 6;
        int[][] g = {{0, 0}, {1, 1}, {2, 3}};
        int[][] w = {{0, 1}, {2, 2}, {1, 4}};
        assertEquals(7, t.countUnguarded(m, n, g, w));
    }

    @Test
    void test11() {
        int m = 3;
        int n = 3;
        int[][] g = { {1, 1}};
        int[][] w = {{0, 1}, {1, 0}, {1, 2}, {2,1}};
        assertEquals(4, t.countUnguarded(m, n, g, w));
    }
}