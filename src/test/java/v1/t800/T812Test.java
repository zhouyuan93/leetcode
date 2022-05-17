package v1.t800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T812Test {

    T812 t = new T812();

    @Test
    void name() {
        int[][] points = {{8, 3}, {5, 6}, {3, 5}};
        double actual = t.largestTriangleArea(points);
        assertEquals(4.5d,actual);
    }
}