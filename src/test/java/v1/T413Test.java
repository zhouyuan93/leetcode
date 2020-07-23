package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T413Test {

    T413 t;

    @BeforeEach
    void setUp() {
        t = new T413();
    }

    @Test
    void test_1() {
        int[] A = {1, 2, 3, 4, 5};
        int actual = t.numberOfArithmeticSlices(A);
        int except = 6;
        assertEquals(except, actual);
    }

    @Test
    void test_2() {
        int[] A = {1,-1,-3,1,2,3};
        int actual = t.numberOfArithmeticSlices(A);
        int except = 2;
        assertEquals(except, actual);
    }
}