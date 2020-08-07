package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1009Test {

    T1009 t;

    @BeforeEach
    void setUp() {
        t = new T1009();
    }

    @Test
    void test_1() {
        int actual = t.bitwiseComplement(5);
        int expect = 2;
        assertEquals(expect,actual);
    }
}