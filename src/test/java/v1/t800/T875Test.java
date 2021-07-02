package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T875Test {

    T875 t;

    @BeforeEach
    void setUp() {
        t = new T875();
    }

    @Test
    void test_1() {
        int[] quality = {10, 20, 5};
        int[] wage = {70, 50, 30};
        int k = 2;
        double actual = t.mincostToHireWorkers(quality, wage, k);
        double expected = 105;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] quality = {3, 1, 10, 10, 1};
        int[] wage = {4, 8, 2, 2, 7};
        int k = 3;
        double actual = t.mincostToHireWorkers(quality, wage, k);
        double expected = 30.666666666666664;
        assertEquals(expected,actual);
    }
}