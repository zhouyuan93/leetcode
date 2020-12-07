package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T861Test {

    T861 t;

    @BeforeEach
    void setUp() {
        t = new T861();
    }

    @Test
    void test_1() {
        int[][] a = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int actual = t.matrixScore(a);
        int expected = 39;
        assertEquals(expected, actual);
    }
}