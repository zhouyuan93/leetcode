package v1.t400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T427Test {

    T427 t = new T427();

    @Test
    void test_1() {
        int[][] grid = {{0, 1}, {1, 0}};
        T427.Node construct = t.construct(grid);
    }


}