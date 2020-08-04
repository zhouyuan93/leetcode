package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T67;

import static org.junit.jupiter.api.Assertions.*;

class T67Test {
    private T67 t;

    @BeforeEach
    void setUp() {
        t = new T67();
    }

    @Test
    void test3() {
        String a = "0";
        String b = "1";
        String actual = t.addBinary(a, b);
        String expect = "1";
        assertEquals(expect, actual);
    }
    @Test
    void test2() {
        String a = "0";
        String b = "0";
        String actual = t.addBinary(a, b);
        String expect = "0";
        assertEquals(expect, actual);
    }

    @Test
    void test1() {
        String a = "111";
        String b = "1";
        String actual = t.addBinary(a, b);
        String expect = "1000";
        assertEquals(expect, actual);
    }
}