package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1460Test {

    T1460 t;

    @BeforeEach
    void setUp() {
        t = new T1460();
    }

    @Test
    void test_1() {
        int[] target = {1, 4, 5, 6, 7};
        int[] arr = { 4, 1, 6, 5, 7};
        boolean actual = t.canBeEqual(target, arr);
        assertEquals(true, actual);
    }
}