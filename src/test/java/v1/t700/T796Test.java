package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T796Test {

    T796 t;

    @BeforeEach
    void setUp() {
        t = new T796();
    }

    @Test
    void test_1() {
        String a = "abcde";
        String b = "bcdea";
        assertTrue(t.rotateString(a, b));
    }
}