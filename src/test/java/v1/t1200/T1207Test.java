package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1207Test {

    T1207 t;


    @BeforeEach
    void setUp() {
        t = new T1207();
    }

    @Test
    void test_1() {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean actual = t.uniqueOccurrences(arr);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        int[] arr = {1,2};
        boolean actual = t.uniqueOccurrences(arr);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}