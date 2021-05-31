package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1832Test {

    T1832 t;

    @BeforeEach
    void setUp() {
        t = new T1832();
    }

    @Test
    void test_1() {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        boolean actual = t.checkIfPangram(s);
        boolean expecte = true;
        assertEquals(expecte, actual);
    }
}