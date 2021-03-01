package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T900Test {

    T900 t;

    @BeforeEach
    void setUp() {
        t = new T900();
    }

    @Test
    void test_1() {
        int[] A = {3, 8, 0, 9, 2, 5};
        T900.RLEIterator rleIterator = new T900.RLEIterator(A);
        assertEquals(8,rleIterator.next(2));
        assertEquals(8,rleIterator.next(1));
        assertEquals(5,rleIterator.next(1));
        assertEquals(-1,rleIterator.next(2));
    }
}