package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1846Test {

    T1846 t;

    @BeforeEach
    void setUp() {
        t = new T1846();
    }

    @Test
    void test_1() {
        int[] arr = {1, 1, 2, 2, 2};
        int a = t.maximumElementAfterDecrementingAndRearranging(arr);
        int e = 2;
        assertEquals(e, a);
    }
}