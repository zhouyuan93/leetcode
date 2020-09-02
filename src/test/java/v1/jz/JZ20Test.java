package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ20Test {
    JZ20 t;

    @BeforeEach
    void setUp() {
        t = new JZ20();
    }

    @Test
    void test_1() {
        String s = "1 ";
        boolean actual = t.isNumber(s);
        boolean expect = true;
        assertEquals(expect,actual);
    }

    @Test
    void test_2() {
        String s = ".1";
        boolean actual = t.isNumber(s);
        boolean expect = true;
        assertEquals(expect,actual);
    }
}