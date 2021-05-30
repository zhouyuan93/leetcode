package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1704Test {

    T1704 t;

    @BeforeEach
    void setUp() {
        t = new T1704();
    }

    @Test
    void test_1() {
        String s = "book";
        boolean actual = t.halvesAreAlike(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}