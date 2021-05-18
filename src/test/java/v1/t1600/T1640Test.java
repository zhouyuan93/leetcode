package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1640Test {

    T1640 t;

    @BeforeEach
    void setUp() {
        t = new T1640();
    }

    @Test
    void test_1() {
        int[] arr = {91,4,64,78};
        int[][] pieces =  {{78},{4,64},{91}};
        boolean actual = t.canFormArray(arr, pieces);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}