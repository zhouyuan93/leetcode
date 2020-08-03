package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T415Test {

    T415 t;

    @BeforeEach
    void setUp() {
        t = new T415();
    }

    @Test
    void test_1() {
        String num1 = "123";
        String num2 = "9";
        String actual = t.addStrings(num1, num2);
        String expect = "132";
        assertEquals(expect, actual);
    }
}