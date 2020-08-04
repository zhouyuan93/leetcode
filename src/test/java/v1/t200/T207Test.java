package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t200.T207;

import static org.junit.jupiter.api.Assertions.*;

class T207Test {

    T207 t;

    @BeforeEach
    void setUp() {
        t = new T207();
    }

    @Test
    void test_3() {
        int numCourses = 4;
        int[][] prerequisites = new int[][]{{1, 0}, {2, 0}, {0, 3}, {3, 1}};
        boolean actual = t.canFinish(numCourses, prerequisites);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int numCourses = 4;
        int[][] prerequisites = new int[][]{{1, 0}, {2, 0}, {0, 3}};
        boolean actual = t.canFinish(numCourses, prerequisites);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_1() {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}, {0, 1}};
        boolean actual = t.canFinish(numCourses, prerequisites);
        boolean expect = false;
        assertEquals(expect, actual);
    }
}