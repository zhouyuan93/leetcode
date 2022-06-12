package weekend.d20220612;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {

    T2 t = new T2();

    @Test
    void test() {
        int[][] grid = {{5,3},{4,0},{2,1}};
        int[][] cost = {{9, 8}, {1, 5}, {10, 12}, {18, 6}, {2, 4}, {14, 3}};
        assertEquals(17,t.minPathCost(grid, cost));
    }
}