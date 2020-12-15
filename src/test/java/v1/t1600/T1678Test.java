package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1678Test {

    T1678 t;

    @BeforeEach
    void setUp() {
        t = new T1678();
    }

    @Test
    void test_1() {
        String command = "G()(al)";
        String actual = t.interpret(command);
        String expected = "Goal";
        assertEquals(expected,actual);
    }
}