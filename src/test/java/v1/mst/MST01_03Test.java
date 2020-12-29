package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST01_03Test {

    MST01_03 t;

    @BeforeEach
    void setUp() {
        t = new MST01_03();
    }

    @Test
    void test_1() {
        String s = "Mr John Smith   ";
        int length = 13;
        String actual = t.replaceSpaces(s, length);
        String expected = "Mr%20John%20Smith";
        assertEquals(expected,actual);
    }
}