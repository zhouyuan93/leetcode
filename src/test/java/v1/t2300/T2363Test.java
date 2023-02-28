package v1.t2300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2363Test {

    T2363 t;

    @BeforeEach
    void setUp() {
        t = new T2363();
    }

    @Test
    void test_1() {
        int[][] items1 = {{5, 1}, {4, 2}, {3, 3}, {2, 4}, {1, 5}};
        int[][] items2 = {{7, 1}, {6, 2}, {5, 3}, {4, 4}};
        t.mergeSimilarItems(items1, items2);

    }
}