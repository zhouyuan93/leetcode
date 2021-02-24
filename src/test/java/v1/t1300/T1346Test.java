package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1346Test {
    T1346 t;

    @BeforeEach
    void setUp() {
        t = new T1346();
    }

    @Test
    void test_1() {
        int[] arr = {3, 1, 7, 11};
        boolean actual = t.checkIfExist(arr);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] arr = {3, 1, 3, 6};
        boolean actual = t.checkIfExist(arr);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}