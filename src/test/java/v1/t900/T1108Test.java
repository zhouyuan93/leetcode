package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1108Test {

    T1108 t;

    @BeforeEach
    void setUp() {
        t = new T1108();
    }

    @Test
    void test_1() {
        String address = "1.1.1.1";
        String actual = t.defangIPaddr(address);
        String expected = "1[.]1[.]1[.]1";
        assertEquals(expected, actual);
    }
}