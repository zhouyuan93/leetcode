package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1047Test {

    T1047 t;

    @BeforeEach
    void setUp() {
        t = new T1047();
    }

    @Test
    void test_1() {
        String s = "abbaca";
        String actual = t.removeDuplicates(s);
        String expected = "ca";
        assertEquals(expected,actual);
    }
}